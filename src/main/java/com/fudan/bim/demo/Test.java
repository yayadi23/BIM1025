package com.fudan.bim.demo;

import com.fudan.bim.ifc.IfcReader;
import ifc2x3javatoolbox.ifc2x3tc1.*;
import ifc2x3javatoolbox.ifcmodel.IfcModel;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.io.*;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.*;

/**
 * Created by Diak on 2017/10/25.
 */
public class Test {

    private Writer writer = null;

    public void storeProperties(IfcModel ifcModel) {
        Collection<ClassInterface> ifcObjects = ifcModel.getIfcObjects();
        Settings settings = Settings.builder().put("cluster.name", "elasticsearch-test-cluster").build();
        try {
            //这里的端口应该是9300
            TransportClient client = new PreBuiltTransportClient(settings).addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("10.141.211.152"), 9300));
            GetResponse response = client.prepareGet("bimtest1020", "ifcwall", "1").execute().actionGet();
            System.out.println(response.getSourceAsString());
            storePropertiesToFile(ifcModel);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public void storePropertiesToFile(IfcModel ifcModel) {
        try {

            //先遍历所有rel中的ifcobject有哪些，同时他们所指向的ifcpropertyset有哪些
            Collection<ClassInterface> ifcObjects = ifcModel.getIfcObjects();
            ArrayList<Integer> storedList = new ArrayList<>();

            Map<Integer, List<Integer>> objectToRelMap = new HashMap<>();
            List<Integer> relList = null;
            Map<Integer, Integer> relToSetMap = new HashMap<>();
            Map<Integer, List<Integer>> setToValueMap = new HashMap<>();
            List<Integer> valueList = null;

            StringBuilder json = null;


            File file = new File("D:\\Experiment\\IfcJson1028\\IfcJson.json");
            if (!file.exists()) {
                file.createNewFile();
            }
            writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file), "UTF-8"));
            //先存储IfcObject的json
            for (ClassInterface classInterface : ifcObjects) {
                if (classInterface instanceof IfcObject) {
                    if (classInterface.getStepLineNumber() == 155) {
                        System.out.println();
                    }
                    IfcObject ifcObject = (IfcObject) classInterface;
                    Set<IfcRelDefines> relDefines = ifcObject.getIsDefinedBy_Inverse();
                    int flag = 0;
                    if (relDefines != null) {//先打印有propertydeifcobject，其余的ifcobejct与其他ifc对象一起打印；//这里有可能是reldefinesbytype
//                    storedList.add(ifcObject.getStepLineNumber());//加入storedList
                        json = new StringBuilder();
                        json.append("{");
                        json.append(appendAttributes(ifcObject));//将ifcObject本身的字段打印出来
                        json.append(",\"" + "Properties" + "\":[");
                        int size = relDefines.size();
                        Iterator<IfcRelDefines> relDefinesIterator = relDefines.iterator();
                        IfcRelDefines ifcRelDefines;
                        int i = 0;
                        for (; i < size - 1 && relDefinesIterator.hasNext(); i++) {
                            ifcRelDefines = relDefinesIterator.next();
                            if (ifcRelDefines instanceof IfcRelDefinesByProperties) {
                                flag = 1;
                                json.append("{" + appendRelAttributes(ifcRelDefines) + "},");
                            }

                        }
                        ifcRelDefines = relDefinesIterator.next();
                        if (ifcRelDefines instanceof IfcRelDefinesByProperties) {
                            flag = 1;
                            json.append("{" + appendRelAttributes(ifcRelDefines) + "}");
                            json.append("]");
                            json.append("}");
                        }
                    }
                    if (flag == 1) {
                        writer.write(json.toString() + "\n");
                    }
                }
            }
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public String appendAttributes(ClassInterface classInterface) {
        //循环attributes，调用appendValue
        StringBuilder jsonSb = new StringBuilder();
        ArrayList<CloneableObject> paramList = InternalAccess.getStepParameter((InternalAccessClass) classInterface);
        String[] attributes = classInterface.getAttributes();
        if (attributes.length == paramList.size()) {
            int i = 0;
            for (; i < attributes.length - 1; i++) {
                jsonSb.append("\"" + attributes[i] + "\":" + appendValue(paramList.get(i)) + ",");//"GlobalId":"2048u023";
            }
            jsonSb.append("\"" + attributes[i] + "\":" + appendValue(paramList.get(i)));
        } else {
            System.out.println("attributes.length != paramList.size()");
        }
        return jsonSb.toString();
    }

    public String appendRelAttributes(IfcRelDefines ifcRelDefines) {
        StringBuilder jsonSb = new StringBuilder();
        ArrayList<CloneableObject> paramList = InternalAccess.getStepParameter(ifcRelDefines);
        String[] attributes = ifcRelDefines.getAttributes();
        jsonSb.append("\"Id\":" + ifcRelDefines.getStepLineNumber() + ",\"Type\":\"IfcRelDefinesByProperties\",");//"Id":10,"Type":"IfcRelDefinesByProperties",
        if (attributes.length == paramList.size()) {
            int i = 0;
            for (; i < attributes.length - 1; i++) {
                jsonSb.append("\"" + attributes[i] + "\":" + appendValue(paramList.get(i)) + ",");//"GlobalId":"2048u023",
            }
            jsonSb.append("\"" + attributes[i] + "\":{" + appendSetAttributes((IfcPropertySetDefinition) paramList.get(i)) + "}");//处理PropertySet {"Id":"","Type":"IfcPropertySet","GlobalId":"",...,"HasProperties":{}}
        }
        return jsonSb.toString();
    }

    public String appendSetAttributes(IfcPropertySetDefinition ifcPropertySetDefinition) {
        StringBuilder jsonSb = new StringBuilder();
        ArrayList<CloneableObject> paramList = InternalAccess.getStepParameter(ifcPropertySetDefinition);
        String[] attributes = ifcPropertySetDefinition.getAttributes();
        String className = ifcPropertySetDefinition.getClass().getSimpleName();
        jsonSb.append("\"Id\":" + ifcPropertySetDefinition.getStepLineNumber() + ",\"Type\":\"" + className + "\",");//"Id":10,"Type":"xxxxxx",
        if (attributes.length == paramList.size()) {
            if (ifcPropertySetDefinition instanceof IfcPropertySet) {
                int i = 0;
                for (; i < attributes.length - 1; i++) {
                    jsonSb.append("\"" + attributes[i] + "\":" + appendValue(paramList.get(i)) + ",");//"GlobalId":"2048u023",
                }
                jsonSb.append("\"" + attributes[i] + "\":[" + appendPropertyValue((Set<IfcProperty>) paramList.get(i)) + "]");//"HasProperties":[{"Id":"","Type":"IfcPropertySingleValue","Name":"",..}]
            } else {
                System.out.println("not a IfcPropertySet:" + ifcPropertySetDefinition.getClass().getSimpleName() + " " + ifcPropertySetDefinition.getStepLineNumber());
            }
        }
        return jsonSb.toString();
    }

    public String appendPropertyValue(Set<IfcProperty> properties) { //{"Id":"","Type":"IfcPropertySingleValue","Name":"",..}
        StringBuilder jsonSb = new StringBuilder();
        int i = 0;
        IfcProperty ifcProperty = null;
        Iterator<IfcProperty> propertyIterator = properties.iterator();
        int size = properties.size();
        for (; i < size - 1 && propertyIterator.hasNext(); i++) {
            ifcProperty = propertyIterator.next();
            jsonSb.append("{\"Id\":" + ifcProperty.getStepLineNumber() + ",\"Type\":\"" + ifcProperty.getClass().getSimpleName() + "\"," + appendAttributes(ifcProperty) + "},");
        }
        ifcProperty = propertyIterator.next();
        jsonSb.append("{\"Id\":" + ifcProperty.getStepLineNumber() + ",\"Type\":\"" + ifcProperty.getClass().getSimpleName() + "\"," + appendAttributes(ifcProperty) + "}");
        return jsonSb.toString();
    }

    public String appendValue(CloneableObject value) {
        StringBuilder jsonSb = new StringBuilder();
        if (value instanceof ClassInterface) {
            //存储id值
            int referredClassId = ((ClassInterface) value).getStepLineNumber();
            jsonSb.append(referredClassId);
        } else if (value instanceof LIST) {
            //需要处理集合
            jsonSb.append(resolveCollections(value));
        } else if (value instanceof SET) {
            //需要处理集合
            jsonSb.append(resolveCollections(value));
        } else if (value instanceof DOUBLE) {
            //输出Double
            jsonSb.append(((DOUBLE) value).value);
        } else if (value instanceof INTEGER) {
            //输出int
            jsonSb.append(((INTEGER) value).value);
        } else if (value instanceof STRING) {
            //输出
            jsonSb.append("\"" + value + "\"");
        } else if (value instanceof BINARY) {
            jsonSb.append("\"" + value.toString() + "\"");
        } else if (value instanceof ENUM) {
            jsonSb.append("\"" + ((ENUM) value).getStepParameter(true) + "\"");
        } else if (value instanceof LOGICAL) {
            jsonSb.append(value.toString());
        } else if (value instanceof BOOLEAN) {
            jsonSb.append(((BOOLEAN) value).value);
        } else if (value == null) {
            jsonSb.append("\"\"");
        }
        return jsonSb.toString();
    }

    public String resolveCollections(CloneableObject value) {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int count = 0;
        if (value instanceof LIST) {
            LIST<CloneableObject> valueList = (LIST<CloneableObject>) value;
            for (CloneableObject innerValue : valueList) {
                count++;
                if (innerValue instanceof ClassInterface) {
                    sb.append(((ClassInterface) innerValue).getStepLineNumber());
                } else if (innerValue instanceof INTEGER) {
                    sb.append(((INTEGER) innerValue).value);
                } else if (innerValue instanceof DOUBLE) {
                    sb.append(((DOUBLE) innerValue).value);
                } else if (innerValue instanceof STRING) {
                    sb.append("\"" + innerValue + "\"");
                } else if (innerValue instanceof ENUM) {
                    sb.append("\"" + ((ENUM) innerValue).getStepParameter(true) + "\"");
                } else if (innerValue instanceof BINARY) {
                    sb.append("\"" + innerValue.toString() + "\"");
                } else if (innerValue instanceof LOGICAL) {
                    sb.append(innerValue.toString());
                } else if (value instanceof BOOLEAN) {
                    sb.append(((BOOLEAN) value).value);
                } else if (value == null) {
                    sb.append("\"\"");
                }
                if (count < valueList.size()) {
                    sb.append(",");
                } else {
                    sb.append("]");
                }
            }
            return sb.toString();
        } else if (value instanceof SET) {
            SET<CloneableObject> valueSet = (SET<CloneableObject>) value;
            for (CloneableObject innerValue : valueSet) {
                count++;
                if (innerValue instanceof ClassInterface) {
                    sb.append(((ClassInterface) innerValue).getStepLineNumber());
                } else if (innerValue instanceof INTEGER) {
                    sb.append(((INTEGER) innerValue).value);
                } else if (innerValue instanceof DOUBLE) {
                    sb.append(((DOUBLE) innerValue).value);
                } else if (innerValue instanceof STRING) {
                    sb.append("\"" + innerValue + "\"");
                } else if (innerValue instanceof ENUM) {
                    sb.append("\"" + ((ENUM) innerValue).getStepParameter(true) + "\"");
                } else if (innerValue instanceof BINARY) {
                    sb.append("\"" + innerValue.toString() + "\"");
                } else if (innerValue instanceof LOGICAL) {
                    sb.append(innerValue.toString());
                } else if (value instanceof BOOLEAN) {
                    sb.append(((BOOLEAN) value).value);
                } else if (value == null) {
                    sb.append("\"\"");
                }
                if (count < valueSet.size()) {
                    sb.append(",");
                } else {
                    sb.append("]");
                }
            }
            return sb.toString();
        } else {
            System.out.println("not LIST or SET");
        }
        return null;
    }


//        for(ClassInterface classInterface : ifcObjects){
//            if(classInterface instanceof IfcObject){
//                IfcObject ifcObject = (IfcObject)classInterface;
//                Set<IfcRelDefines> relDefines = ifcObject.getIsDefinedBy_Inverse();
//                for(IfcRelDefines ifcRelDefines : relDefines){
//                    noStoreList.add(ifcRelDefines.getStepLineNumber());//加入noStoreList
//                    if(ifcRelDefines instanceof IfcRelDefinesByProperties){
//                        IfcRelDefinesByProperties ifcRelDefinesByProperties = (IfcRelDefinesByProperties)ifcRelDefines;
//                        IfcPropertySetDefinition ifcPropertySetDefinition = ifcRelDefinesByProperties.getRelatingPropertyDefinition();
//                        noStoreList.add(ifcPropertySetDefinition.getStepLineNumber());//加入noStoreList
//                        //对于不同的propertyset的子类，有些是没有引用的，有些是有引用的，应该在存储的过程中，先存储IfcObject，如果是同种类型的存储会给集群减少一些压力吧。所有的存储到的都加入到noStoreList中去。
//                    }
//                }
//            }
//        }
//
//        for(ClassInterface classInterface : ifcObjects){
//            if (classInterface instanceof IfcRelDefinesByProperties){
//                IfcRelDefinesByProperties rel = (IfcRelDefinesByProperties)classInterface;
////                list = InternalAccess.getStepParameter((InternalAccessClass)rel);
//                //当知道属性名称的时候，不是可以直接存取属性值的吗？为什么我要用InternalAccess来取？？好像并不需要，哈哈.当需要取到所有的属性名和属性值时，使用getAttributes+反射和getNonInverseattributesType就可以了。
//                //这样似乎就可以把解析过程中原来注释掉的部分改回来了。
//                Set<IfcObject> objects = rel.getRelatedObjects();
//                IfcPropertySetDefinition setDefinition = rel.getRelatingPropertyDefinition();
//                for(IfcObject object : objects){
//                    if((relList = objectToRelMap.get(object.getStepLineNumber())) != null){
//                        relList.add(rel.getStepLineNumber());
//                    } else {
//                        relList = new ArrayList<>();
//                        relList.add(rel.getStepLineNumber());
//                    }
//                    objectToRelMap.put(object.getStepLineNumber(),relList);
//                    relToSetMap.put(rel.getStepLineNumber(),setDefinition.getStepLineNumber());
//                    //获取set的所有值
//                    //似乎reldefines就可以得到所有的属性了啊。
//                    object.getIsDefinedBy_Inverse();
//                }
//            } else if (classInterface instanceof IfcTypeObject){
//
//            }
//        }


    public void storeRelationships(IfcModel ifcModel) {
        Collection<ClassInterface> ifcObjects = ifcModel.getIfcObjects();
    }

    public static void main(String[] args) {
        IfcReader ifcReader = new IfcReader();
        IfcModel ifcModel = ifcReader.read("D:\\ALLBIM\\ifc-files\\revitT0.ifc");
        Test test = new Test();
//        test.storeProperties(ifcModel);
//        test.storeRelationships(ifcModel);
        test.storePropertiesToFile(ifcModel);
    }
}

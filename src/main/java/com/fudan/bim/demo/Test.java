package com.fudan.bim.demo;

import com.fudan.bim.ifc.IfcReader;
import ifc2x3javatoolbox.ifc2x3tc1.ClassInterface;
import ifc2x3javatoolbox.ifcmodel.IfcModel;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.client.Client;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.transport.TransportAddress;
import org.elasticsearch.transport.client.PreBuiltTransportClient;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.List;

/**
 * Created by Diak on 2017/10/25.
 */
public class Test {

    public void storeProeprteis(IfcModel ifcModel){
        Collection<ClassInterface> ifcObjects = ifcModel.getIfcObjects();
        Settings settings = Settings.builder().put("cluster.name","elasticsearch-test-cluster").build();
        try {
            //这里的端口应该是9300
            TransportClient client = new PreBuiltTransportClient(settings).addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("10.141.211.152"),9300));
            GetResponse response = client.prepareGet("bimtest1020","ifcwall","1").execute().actionGet();
            System.out.println(response.getSourceAsString());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }

    public void storeRelationships(IfcModel ifcModel){
        Collection<ClassInterface> ifcObjects = ifcModel.getIfcObjects();
    }

    public static void main(String[] args){
//        IfcReader ifcReader = new IfcReader();
//        IfcModel ifcModel = ifcReader.read("D:\\ALLBIM\\ifc-files\\revitT0.ifc");
//        Test test = new Test();
//        test.storeProeprteis(ifcModel);
//        test.storeRelationships(ifcModel);

        Settings settings = Settings.builder().put("cluster.name","elasticsearch-test-cluster").build();
        try {
            //这里的端口应该是9300
            TransportClient client = new PreBuiltTransportClient(settings).addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("10.141.211.152"),9300));
            GetResponse response = client.prepareGet("bimtest1020","ifcwall","1").execute().actionGet();
            System.out.println(response.getSourceAsString());
            response = client.prepareGet("bimtest1020","ifcwall","2").execute().actionGet();
            System.out.println(response.getSourceAsString());
            response = client.prepareGet("bimtest1020","ifcwall","3").execute().actionGet();
            System.out.println(response.getSourceAsString());
            client.close();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}

package com.fudan.bim.ifc;

import ifc2x3javatoolbox.ifcmodel.IfcModel;

import java.io.File;

/**
 * Created by Diak on 2017/10/25.
 */
public class IfcReader {

    private IfcModel ifcModel = null;

    public IfcReader() {}

    public IfcModel read(String filePath){
        ifcModel = new IfcModel();
        try {
            ifcModel.readStepFile(new File(filePath));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ifcModel;
    }
}
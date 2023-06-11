package com.hanhwa.jsonparser.program;

import java.io.IOException;

public class JSONParser {
    private static final JSONFileReader jsonFileReader = new JSONFileReader();
    private static final ObjectBinder objectBinder = new ObjectBinder();

//    public JSONParser(JSONFileReader jsonFileReader, ObjectBinder objectBinder) {
//        this.jsonFileReader = jsonFileReader;
//        this.objectBinder = objectBinder;
//    }

    public static void jsonParsing(String jsonFileName){
        String jsonFileContent = null;
        try {
            jsonFileContent = jsonFileReader.readFile(jsonFileName);
            while(jsonFileContent != null) {
                objectBinder.bindingObject(jsonFileContent, jsonFileName);
                break;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

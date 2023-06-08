package com.hanhwa.jsonparser.program;

import java.io.IOException;

public class JSONParser {
    public static void jsonParsing(String jsonFileName, JSONFileReader jsonFileReader, ObjectBinder objectBinder){
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

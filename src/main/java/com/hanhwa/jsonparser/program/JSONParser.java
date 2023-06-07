package com.hanhwa.jsonparser.program;

import java.io.IOException;

public class JSONParser {
    public void jsonParsing(String jsonFileName, JSONFileReader jsonFileReader, ObjectBinder objectBinder){
        String jsonFileContent = null;
        try {
            jsonFileContent = jsonFileReader.readFile(jsonFileName);
            while(!jsonFileContent.isEmpty()) {
                objectBinder.createObject(jsonFileContent);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

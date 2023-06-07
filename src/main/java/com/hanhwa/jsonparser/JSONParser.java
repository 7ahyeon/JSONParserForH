package com.hanhwa.jsonparser;

public class JSONParser {
    public void jsonParsing(String jsonFilePath, JSONFileReader jsonFileReader, ObjectBinder objectBinder){
        String jsonFileContent = jsonFileReader.readFile(jsonFilePath);
        BindingObject bindingObject = objectBinder.createObject(jsonFileContent);
    }
}

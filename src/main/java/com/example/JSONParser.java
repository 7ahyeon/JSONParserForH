package com.example;

public class JSONParser {
    public void jsonParsing(String jsonFilePath, JSONFileReader jsonFileReader, ObjectBinder objectBinder){
        String jsonFileContent = jsonFileReader.read(jsonFilePath);
        BindingObject bindingObject = objectBinder.createObject(jsonFileContent);
    }
}

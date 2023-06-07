package com.hanhwa.jsonparser.program;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class ObjectBinder {
    public void createObject(String jsonFileContent, String jsonFileName){
        // Underscore를 CamelCase로 자동 변환
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES).create();
        ObjectList objectList = gson.fromJson(jsonFileContent, ObjectList.class);
    }
}

package com.example;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ObjectBinder {
    public bindingObject createObject(String jsonFileContent){
        ObjectMapper objectMapper = new ObjectMapper();
        // 필요한 데이터만 파싱
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        // Object 바인딩
        BindingObject bindingObject = objectMapper.readValue(jsonFileContent, bindingObject.class);
        return bindingObject;
    }
}

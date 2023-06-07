package com.hanhwa.jsonparser;

import com.google.gson.Gson;

public class ObjectBinder {
    public void createObject(String jsonFileContent){
        Gson gson = new Gson();
        BindingObject bindingObject = gson.fromJson(jsonFileContent, BindingObject.class);
    }
}

package com.hanhwa.jsonparser.rsrv.biz;

import java.io.IOException;

public class JsonParser {
    // 구현제 의존 없도록 하기 위하여 인터페이스 생성할 예정(현재 의존 역전 원칙(DIP) 위배)
    private static final JsonFileReader jsonFileReader = new JsonFileReader();
    private static final ObjectBinder objectBinder = new ObjectBinder();

//    public JSONParser(JSONFileReader jsonFileReader, ObjectBinder objectBinder) {
//        this.jsonFileReader = jsonFileReader;
//        this.objectBinder = objectBinder;
//    }

    public static void jsonParsing(String jsonFileName){
        String jsonFileContent = null;
        try {
            jsonFileContent = jsonFileReader.readFile(jsonFileName); // JSONFileReader : 파일 읽기(파일명)
            while(jsonFileContent != null) { // 파일 내용이 있을 시(없을 시 처리 필요)
                objectBinder.bindingObject(jsonFileContent, jsonFileName); // ObjectBinder : Object에 바인딩하기(파일 내용, 파일명)
                break;
            }
        } catch (IOException e) { // Exception 별도 처리 필요
            throw new RuntimeException(e);
        }

    }
}

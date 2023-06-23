package com.hanhwa.jsonparser.rsrv.localserver.model.common.biz.deserialize;

public interface JsonToObject { // 역직렬화
    // JSON 파일 경로 얻기
    String getFilePath(String jsonFileName);
    // JSON 파일 읽기
    String readFile(String jsonFilePath);
    // 요청/응답 읽기(JSON 전문 Object 바인딩)
    Object bindingObject(String jsonFileContent, String jsonFileName);
}

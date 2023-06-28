package com.hanhwa.jsonparser.rsrv.model.common.serialize;

public interface ObjectToJson { // 직렬화

    // 요청/응답 처리 결정
    String selectService(int select);
    // 요청/응답 전문 생성
    String parsingJson(String rsrvSelect);
}

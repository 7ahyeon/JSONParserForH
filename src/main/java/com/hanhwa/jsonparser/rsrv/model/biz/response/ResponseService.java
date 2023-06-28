package com.hanhwa.jsonparser.rsrv.model.biz.response;

public interface ResponseService {
    // 요청에 따른 응답 JSON 생성
    String createRequestJson(int select);
}

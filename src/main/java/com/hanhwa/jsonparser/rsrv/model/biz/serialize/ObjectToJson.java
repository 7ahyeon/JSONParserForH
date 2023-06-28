package com.hanhwa.jsonparser.rsrv.model.biz.serialize;


import com.hanhwa.jsonparser.rsrv.model.dto.resp.RsrvResponse;

public interface ObjectToJson { // 직렬화
    // 응답 JSON 전문 생성
    String parsingJson(RsrvResponse rsrvResponse);
}

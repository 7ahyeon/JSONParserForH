package com.hanhwa.jsonparser.rsrv.localserver.model.common.biz.serialize;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hanhwa.jsonparser.rsrv.localserver.model.request.dto.RsrvRequest;
import com.hanhwa.jsonparser.rsrv.localserver.model.util.localdate.LocalDateDeserializer;

import java.time.LocalDate;

public class ObjectToJsonImpl implements ObjectToJson {

    @Override // 신청/조회/수정/취소/기간조회 처리 결정
    public String selectService(String jsonFileName) {
        if (jsonFileName.endsWith(".json")) {
            jsonFileName = jsonFileName.replace(".json", "");
            // 예약 요청
            if (jsonFileName.endsWith("ReqRq")||jsonFileName.endsWith("ReqRs")) {
                return "req";
            }
        }
        return "fail";
    }

    @Override // 요청/응답 전문 생성
    public String parsingJson(String rsrvSelect) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(LocalDate.class, new LocalDateDeserializer());
        Gson gson = gsonBuilder.setPrettyPrinting().create();
        String jsonContext = null;

        switch (rsrvSelect) {
            case "request":
                String rsrvRequest = gson.toJson(RsrvRequest.class, RsrvRequest.class);
                System.out.println(rsrvRequest);
                jsonContext = rsrvRequest;
                break;
        }
        return jsonContext;
    }
}

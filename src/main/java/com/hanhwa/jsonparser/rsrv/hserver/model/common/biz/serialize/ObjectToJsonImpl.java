package com.hanhwa.jsonparser.rsrv.hserver.model.common.biz.serialize;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hanhwa.jsonparser.rsrv.hserver.model.request.dto.RsrvRequest;
import com.hanhwa.jsonparser.rsrv.hserver.model.util.localdate.LocalDateDeserializer;
import com.hanhwa.jsonparser.rsrv.hserver.model.util.localdatetime.LocalDateTimeDeserializer;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ObjectToJsonImpl implements ObjectToJson {

    @Override // 신청/조회/수정/취소/기간조회 처리 결정
    public String selectService(String jsonFileName) {
        String select = "fail";
        if (jsonFileName.endsWith(".json")) {
            jsonFileName = jsonFileName.replace(".json", "");
            // 예약 요청
            if (jsonFileName.endsWith("ReqRq")||jsonFileName.endsWith("ReqRs")) {
                select = "req";
            } else {
                select = "fail";
            }
        }
        return select;
    }

    @Override // 요청/응답 전문 생성
    public String parsingJson(String rsrvSelect) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(LocalDate.class, new LocalDateDeserializer());
        gsonBuilder.registerTypeAdapter(LocalDateTime.class, new LocalDateTimeDeserializer());
        Gson gson = gsonBuilder.serializeNulls().setPrettyPrinting().create();
        String jsonContext = null;

        switch (rsrvSelect) {
            case "req":
                RsrvRequest rsrvRequest = new RsrvRequest();
                System.out.println(rsrvRequest.toString());
                String rsrvRequest1 = gson.toJson(rsrvRequest);
                System.out.println("ddd");
                System.out.println(rsrvRequest1);
                jsonContext = rsrvRequest1;
                break;
        }
        return jsonContext;
    }
}

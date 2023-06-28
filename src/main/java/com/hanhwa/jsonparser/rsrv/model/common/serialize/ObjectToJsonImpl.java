package com.hanhwa.jsonparser.rsrv.model.common.serialize;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hanhwa.jsonparser.rsrv.model.request.dto.RsrvRequest;
import com.hanhwa.jsonparser.rsrv.model.util.localdate.LocalDateSerializer;
import com.hanhwa.jsonparser.rsrv.model.util.localdatetime.LocalDateTimeSerializer;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ObjectToJsonImpl implements ObjectToJson {

    @Override // 신청/조회/수정/취소/기간조회 처리 결정
    public String selectService(int select) {
        // 성능 차이 : if문이 3개일 때 까지는 if문이 빠르나 그 외에는  switch case문이 빠름(컴파일러 최적화시 유리함)
        String jsonFileName = null;
        switch(select) {
            case 1:
                jsonFileName = "RsrvReqRs.json";
                break;
            case 2:
                jsonFileName = "RsrvModRs.json";
                break;
            case 3:
                jsonFileName = "RsrvCnclRs.json";
                break;
            case 4:
                jsonFileName = "RsrvCalRs.json";
                break;
        }
        return jsonFileName;
    }

    @Override // 요청/응답 전문 생성
    public String parsingJson(String rsrvSelect) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(LocalDate.class, new LocalDateSerializer());
        gsonBuilder.registerTypeAdapter(LocalDateTime.class, new LocalDateTimeSerializer());
        Gson gson = gsonBuilder.serializeNulls().setPrettyPrinting().create();
        String jsonContext = null;

        switch (rsrvSelect) {
            case "req":
                RsrvRequest rsrvRequest = new RsrvRequest();
                String rsrvRequest1 = gson.toJson(rsrvRequest);
                jsonContext = rsrvRequest1;
                break;
        }
        return jsonContext;
    }
}

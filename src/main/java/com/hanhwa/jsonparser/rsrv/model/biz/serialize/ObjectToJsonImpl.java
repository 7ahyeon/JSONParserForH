package com.hanhwa.jsonparser.rsrv.model.biz.serialize;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hanhwa.jsonparser.rsrv.model.biz.util.localdate.LocalDateSerializer;
import com.hanhwa.jsonparser.rsrv.model.biz.util.localdatetime.LocalDateTimeSerializer;
import com.hanhwa.jsonparser.rsrv.model.dto.resp.RsrvResponse;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ObjectToJsonImpl implements ObjectToJson {
    // 응답 JSON 전문 생성
    @Override
    public String parsingJson(RsrvResponse rsrvResponse) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.registerTypeAdapter(LocalDate.class, new LocalDateSerializer());
        gsonBuilder.registerTypeAdapter(LocalDateTime.class, new LocalDateTimeSerializer());
        Gson gson = gsonBuilder.serializeNulls().setPrettyPrinting().create();

        String jsonContent = gson.toJson(rsrvResponse);
        return jsonContent;
    }
}

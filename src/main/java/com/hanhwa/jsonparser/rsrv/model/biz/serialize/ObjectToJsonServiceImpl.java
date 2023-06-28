package com.hanhwa.jsonparser.rsrv.model.biz.serialize;

import com.hanhwa.jsonparser.rsrv.model.dto.resp.RsrvResponse;

public class ObjectToJsonServiceImpl implements ObjectToJsonService {
    private final ObjectToJson objectToJson;

    public ObjectToJsonServiceImpl(ObjectToJson objectToJson) {
        this.objectToJson = objectToJson;
    }

    @Override
    public String objectToJson(RsrvResponse rsrvResponse) {
        String jsonContent = objectToJson.parsingJson(rsrvResponse);
        return jsonContent;
    }

}

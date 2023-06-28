package com.hanhwa.jsonparser.rsrv.model.common.serialize;

public class ObjectToJsonServiceImpl implements ObjectToJsonService {
    private final ObjectToJson objectToJson;

    public ObjectToJsonServiceImpl(ObjectToJson objectToJson) {
        this.objectToJson = objectToJson;
    }

    @Override
    public String objectToJson(int select) {
        String rsrvSelect = objectToJson.selectService(select);
        if (rsrvSelect != "fail") {
            String jsonContext = objectToJson.parsingJson(rsrvSelect);
            if (jsonContext != null) {
                return jsonContext;
            } else {
                return "fail";
            }
        } else {
            return "fail";
        }
    }
}

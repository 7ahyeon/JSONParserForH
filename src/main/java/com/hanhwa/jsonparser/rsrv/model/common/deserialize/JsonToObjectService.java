package com.hanhwa.jsonparser.rsrv.model.common.deserialize;

public interface JsonToObjectService {
    // 역직렬화
    Object JsonToObject(String jsonFileName);
}

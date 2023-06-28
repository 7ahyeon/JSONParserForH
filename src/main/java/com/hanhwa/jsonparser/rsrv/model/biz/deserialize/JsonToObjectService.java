package com.hanhwa.jsonparser.rsrv.model.biz.deserialize;

public interface JsonToObjectService {
    // 역직렬화
    Object JsonToObject(String jsonContent);
}

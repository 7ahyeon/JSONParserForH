package com.hanhwa.jsonparser.rsrv.localserver.model.common.biz.deserialize;

public interface JsonToObjectService {
    // 직렬화
    Object JsonToObject(String jsonFileName);
}

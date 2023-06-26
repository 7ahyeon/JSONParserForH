package com.hanhwa.jsonparser.rsrv.hserver.model.common.biz.deserialize;

public interface JsonToObjectService {
    // 역직렬화
    Object JsonToObject(String jsonFileName);
}

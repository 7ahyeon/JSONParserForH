package com.hanhwa.jsonparser.rsrv.model.biz.serialize;

import com.hanhwa.jsonparser.rsrv.model.dto.resp.RsrvResponse;

public interface ObjectToJsonService {
    // 직렬화
    String objectToJson(RsrvResponse rsrvResponse);
}

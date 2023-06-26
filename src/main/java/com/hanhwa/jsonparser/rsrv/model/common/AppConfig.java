package com.hanhwa.jsonparser.rsrv.model.common;

import com.hanhwa.jsonparser.rsrv.model.common.deserialize.JsonToObject;
import com.hanhwa.jsonparser.rsrv.model.common.deserialize.JsonToObjectImpl;
import com.hanhwa.jsonparser.rsrv.model.common.deserialize.JsonToObjectService;
import com.hanhwa.jsonparser.rsrv.model.common.deserialize.JsonToObjectServiceImpl;
import com.hanhwa.jsonparser.rsrv.model.common.serialize.ObjectToJson;
import com.hanhwa.jsonparser.rsrv.model.common.serialize.ObjectToJsonImpl;
import com.hanhwa.jsonparser.rsrv.model.common.serialize.ObjectToJsonService;
import com.hanhwa.jsonparser.rsrv.model.common.serialize.ObjectToJsonServiceImpl;
import com.hanhwa.jsonparser.rsrv.model.request.biz.RsrvRequestService;
import com.hanhwa.jsonparser.rsrv.model.request.biz.RsrvRequestServiceImpl;
import com.hanhwa.jsonparser.rsrv.model.request.repository.MemoryRsrvInfoRepository;
import com.hanhwa.jsonparser.rsrv.model.request.repository.RsrvInfoRepository;

public class AppConfig {  // DI(의존관계 주입) : 객체 생성 및 구현체 할당 (외부(스프링 컨테이너) 역할)

    public RsrvRequestService rsrvRequestService() {return new RsrvRequestServiceImpl(rsrvInfoRepository());
    }
    public RsrvInfoRepository rsrvInfoRepository() {
        return new MemoryRsrvInfoRepository();
    }

    public JsonToObjectService jsonToObjectService() {
        return new JsonToObjectServiceImpl(jsonToObject());
    }
    public JsonToObject jsonToObject() {
        return new JsonToObjectImpl();
    }

    public ObjectToJsonService objectToJsonService() {
        return new ObjectToJsonServiceImpl(objectToJson());
    }

    public ObjectToJson objectToJson() {
        return new ObjectToJsonImpl();
    }
}

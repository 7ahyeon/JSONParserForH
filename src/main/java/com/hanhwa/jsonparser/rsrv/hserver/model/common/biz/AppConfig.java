package com.hanhwa.jsonparser.rsrv.hserver.model.common.biz;

import com.hanhwa.jsonparser.rsrv.hserver.model.command.cli.RsrvSelect;
import com.hanhwa.jsonparser.rsrv.hserver.model.command.cli.RsrvSelectImpl;
import com.hanhwa.jsonparser.rsrv.hserver.model.command.cli.RsrvSelectService;
import com.hanhwa.jsonparser.rsrv.hserver.model.command.cli.RsrvSelectServiceImpl;
import com.hanhwa.jsonparser.rsrv.hserver.model.common.biz.deserialize.JsonToObject;
import com.hanhwa.jsonparser.rsrv.hserver.model.common.biz.deserialize.JsonToObjectImpl;
import com.hanhwa.jsonparser.rsrv.hserver.model.common.biz.deserialize.JsonToObjectService;
import com.hanhwa.jsonparser.rsrv.hserver.model.common.biz.deserialize.JsonToObjectServiceImpl;
import com.hanhwa.jsonparser.rsrv.hserver.model.common.biz.serialize.ObjectToJson;
import com.hanhwa.jsonparser.rsrv.hserver.model.common.biz.serialize.ObjectToJsonImpl;
import com.hanhwa.jsonparser.rsrv.hserver.model.common.biz.serialize.ObjectToJsonService;
import com.hanhwa.jsonparser.rsrv.hserver.model.common.biz.serialize.ObjectToJsonServiceImpl;
import com.hanhwa.jsonparser.rsrv.hserver.model.request.biz.RsrvRequestService;
import com.hanhwa.jsonparser.rsrv.hserver.model.request.biz.RsrvRequestServiceImpl;
import com.hanhwa.jsonparser.rsrv.hserver.model.request.repository.MemoryRsrvInfoRepository;
import com.hanhwa.jsonparser.rsrv.hserver.model.request.repository.RsrvInfoRepository;

public class AppConfig {  // DI(의존관계 주입) : 객체 생성 및 구현체 할당 (외부(스프링 컨테이너) 역할)

    public RsrvRequestService rsrvRequestService() {return new RsrvRequestServiceImpl(rsrvInfoRepository());
    }
    public RsrvInfoRepository rsrvInfoRepository() {
        return new MemoryRsrvInfoRepository();
    }

    public RsrvSelectService rsrvSelectService() {
        return new RsrvSelectServiceImpl(rsrvSelect());
    }

    public RsrvSelect rsrvSelect() {
        return new RsrvSelectImpl();
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

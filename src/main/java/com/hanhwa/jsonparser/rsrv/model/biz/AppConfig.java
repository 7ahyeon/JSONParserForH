package com.hanhwa.jsonparser.rsrv.model.biz;

import com.hanhwa.jsonparser.rsrv.model.biz.deserialize.JsonToObject;
import com.hanhwa.jsonparser.rsrv.model.biz.deserialize.JsonToObjectImpl;
import com.hanhwa.jsonparser.rsrv.model.biz.deserialize.JsonToObjectService;
import com.hanhwa.jsonparser.rsrv.model.biz.deserialize.JsonToObjectServiceImpl;
import com.hanhwa.jsonparser.rsrv.model.biz.filereader.FileReader;
import com.hanhwa.jsonparser.rsrv.model.biz.filereader.FileReaderImpl;
import com.hanhwa.jsonparser.rsrv.model.biz.filereader.FileReaderService;
import com.hanhwa.jsonparser.rsrv.model.biz.filereader.FileReaderServiceImpl;
import com.hanhwa.jsonparser.rsrv.model.biz.response.ResponseService;
import com.hanhwa.jsonparser.rsrv.model.biz.response.ResponseServiceImpl;
import com.hanhwa.jsonparser.rsrv.model.biz.serialize.ObjectToJson;
import com.hanhwa.jsonparser.rsrv.model.biz.serialize.ObjectToJsonImpl;
import com.hanhwa.jsonparser.rsrv.model.biz.serialize.ObjectToJsonService;
import com.hanhwa.jsonparser.rsrv.model.biz.serialize.ObjectToJsonServiceImpl;

public class AppConfig {  // DI(의존관계 주입) : 객체 생성 및 구현체 할당 (외부(스프링 컨테이너) 역할)
    public ResponseService responseService() {
        return new ResponseServiceImpl(jsonToObjectService(), fileReaderService(), objectToJsonService());
    }
    public FileReaderService fileReaderService() {
        return new FileReaderServiceImpl(fileReader());
    }
    public FileReader fileReader() {
        return new FileReaderImpl();
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

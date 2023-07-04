package com.hanhwa.jsonparser.rsrv.model.biz.response;

import com.hanhwa.jsonparser.rsrv.model.biz.deserialize.JsonToObject;
import com.hanhwa.jsonparser.rsrv.model.biz.filereader.FileReaderService;
import com.hanhwa.jsonparser.rsrv.model.biz.serialize.ObjectToJson;
import com.hanhwa.jsonparser.rsrv.model.dto.resp.RsrvResponse;

// 요청에 따른 응답 JSON 생성
public class ResponseServiceImpl implements ResponseService {
    private final JsonToObject jsonToObject;
    private final FileReaderService fileReaderService;
    private final ObjectToJson objectToJson;

    public ResponseServiceImpl(JsonToObject jsonToObject, FileReaderService fileReaderService, ObjectToJson objectToJson) {
        this.jsonToObject = jsonToObject;
        this.fileReaderService = fileReaderService;
        this.objectToJson = objectToJson;
    }


    @Override
    public String createRequestJson(int select){
        // 응답 파일 읽기
       String jsonFileContent = fileReaderService.fileRead(select);
        // 응답 Json 전문 Object 바인딩
        RsrvResponse rsrvResponse = (RsrvResponse) jsonToObject.bindingObject(jsonFileContent);
        // 응답 Json 전문 생성
        String jsonContent = objectToJson.parsingJson(rsrvResponse);

        return jsonContent;
    }
}

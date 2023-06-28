package com.hanhwa.jsonparser.rsrv.model.biz.response;

import com.hanhwa.jsonparser.rsrv.model.biz.deserialize.JsonToObjectService;
import com.hanhwa.jsonparser.rsrv.model.biz.filereader.FileReaderService;
import com.hanhwa.jsonparser.rsrv.model.biz.serialize.ObjectToJsonService;
import com.hanhwa.jsonparser.rsrv.model.dto.resp.RsrvResponse;

// 요청에 따른 응답 JSON 생성
public class ResponseServiceImpl implements ResponseService {
    private final JsonToObjectService jsonToObjectService;
    private final FileReaderService fileReaderService;
    private final ObjectToJsonService objectToJsonService;

    public ResponseServiceImpl(JsonToObjectService jsonToObjectService, FileReaderService fileReaderService, ObjectToJsonService objectToJsonService) {
        this.jsonToObjectService = jsonToObjectService;
        this.fileReaderService = fileReaderService;
        this.objectToJsonService = objectToJsonService;
    }

    @Override
    public String createRequestJson(int select){
        // 응답 파일 읽기
       String jsonFileContent = fileReaderService.fileRead(select);
        // 응답 Json 전문 Object 바인딩
        RsrvResponse rsrvResponse = (RsrvResponse) jsonToObjectService.JsonToObject(jsonFileContent);
        // 응답 Json 전문 생성
        String jsonContent = objectToJsonService.objectToJson(rsrvResponse);

        return jsonContent;
    }
}

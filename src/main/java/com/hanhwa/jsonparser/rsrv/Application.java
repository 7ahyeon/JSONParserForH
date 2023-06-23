package com.hanhwa.jsonparser.rsrv;

import com.hanhwa.jsonparser.rsrv.localserver.model.command.cli.RsrvSelectService;
import com.hanhwa.jsonparser.rsrv.localserver.model.common.biz.AppConfig;
import com.hanhwa.jsonparser.rsrv.localserver.model.common.biz.deserialize.JsonToObjectService;
import com.hanhwa.jsonparser.rsrv.localserver.model.common.biz.serialize.ObjectToJsonService;
import com.hanhwa.jsonparser.rsrv.localserver.model.request.biz.RsrvRequestService;
import com.hanhwa.jsonparser.rsrv.localserver.model.request.dto.RsrvRequest;

public class Application {
    public static String application () {
        AppConfig appConfig = new AppConfig();
        RsrvSelectService rsrvSelectService = appConfig.rsrvSelectService();
        int rsrvSelectNo = rsrvSelectService.serviceSelect();
        if (rsrvSelectNo == 1) {
            // 폼 정보 Object 바인딩
            JsonToObjectService jsonToObjectService = appConfig.jsonToObjectService();
            RsrvRequest rsrvRequest = (RsrvRequest) jsonToObjectService.JsonToObject("RsrvReqRq.json");

            // 예약 처리
            RsrvRequestService rsrvRequestService = appConfig.rsrvRequestService();
            long rsrvNo = rsrvRequestService.createRsrvNo();
            boolean duplicateRsrvNo = rsrvRequestService.checkDuplicateRsrvNo(rsrvNo);
            if (duplicateRsrvNo == false) {
                rsrvNo =  rsrvRequestService.createRsrvNo();
            }
            rsrvRequestService.rsrvRequest(rsrvNo, rsrvRequest.getRsrvRequestReq().get(0));

            // 예약 요청 Json 생성
            ObjectToJsonService objectToJsonService = appConfig.objectToJsonService();
            String rsrvReqRq = objectToJsonService.objectToJson("RsrvReqRq.json");
            return rsrvReqRq;
        }
        return null;
    }
}

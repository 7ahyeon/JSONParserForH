package com.hanhwa.jsonparser.program;

import com.hanhwa.jsonparser.dto.RsrvReqRq;

public class ObjectList {
    // 조건별 DTO 데이터 호출
    private String objectName;

    public String chooseObject(String jsonFileName) {
        switch (jsonFileName) {
            case "RsrvReqRq":
                objectName = "RsrvReqRq";
                break;
            case "RsrvReqRs":
                objectName = "RsrvReqRs";
                break;
            case "RsrvCnclRq":
                objectName = "RsrvCnclRq";
                break;
            case "RsrvCnclRs":
                objectName = "RsrvCnclRs";
                break;
            case "RsrvModRq":
                objectName = "RsrvModRq";
                break;
            case "RsrvModRs":
                objectName = "RsrvModRs";
                break;
            case "RsrvCalRq":
                objectName = "RsrvCalRq";
                break;
            case "RsrvCalRs":
                objectName = "RsrvCalRs";
                break;
        }
    return objectName;
    }
}

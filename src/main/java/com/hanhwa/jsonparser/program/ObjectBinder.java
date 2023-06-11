package com.hanhwa.jsonparser.program;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hanhwa.jsonparser.dto.rsrvrq.RsrvRq;

public class ObjectBinder {
    public void bindingObject(String jsonFileContent, String jsonFileName){

        // .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES) : Underscore를 CamelCase로 자동 변환 / 작동 불가 이슈
        // Object @SerializedName 설정 부여
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();
//.serializeNulls()
        switch (jsonFileName.replace(".json", "")) {
            case "RsrvReqRq":
                RsrvRq rsrvRq = gson.fromJson(jsonFileContent, RsrvRq.class);
                System.out.println(rsrvRq.toString());
                break;
//            case "RsrvReqRs":
//                RsrvReqRs rsrvReqRs = gson.fromJson(jsonFileContent, RsrvReqRs.class);
//                System.out.println(rsrvReqRs.toString());
//                break;
//            case "RsrvCnclRq":
//                RsrvCnclRq rsrvCnclRq = gson.fromJson(jsonFileContent, RsrvCnclRq.class);
//                System.out.println(rsrvCnclRq.toString());
//                break;
//            case "RsrvCnclRs":
//                RsrvCnclRs rsrvCnclRs = gson.fromJson(jsonFileContent, RsrvCnclRs.class);
//                System.out.println(rsrvCnclRs.toString());
//                break;
//            case "RsrvModRq":
//                RsrvModRq rsrvModRq = gson.fromJson(jsonFileContent, RsrvModRq.class);
//                System.out.println(rsrvModRq.toString());
//                break;
//            case "RsrvModRs":
//                RsrvModRs rsrvModRs = gson.fromJson(jsonFileContent, RsrvModRs.class);
//                System.out.println(rsrvModRs.toString());
//                break;
//            case "RsrvCalRq":
//                RsrvCalRq rsrvCalRq = gson.fromJson(jsonFileContent, RsrvCalRq.class);
//                System.out.println(rsrvCalRq.toString());
//                break;
//            case "RsrvCalRs":
//                RsrvCalRs rsrvCalRs = gson.fromJson(jsonFileContent, RsrvCalRs.class);
//                System.out.println(rsrvCalRs.toString());
//                break;
        }
    }
}

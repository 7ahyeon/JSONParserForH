package com.hanhwa.jsonparser.program;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hanhwa.jsonparser.dto.*;
import com.hanhwa.jsonparser.dto.rsrvreqrq.RsrvReqRq;

public class ObjectBinder {
    public void bindingObject(String jsonFileContent, String jsonFileName){

        // .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES) : Underscore를 CamelCase로 자동 변환 / 작동 불가 이슈
        // Object @SerializedName 설정 부여
        Gson gson = new GsonBuilder()
                .serializeNulls()
                .setPrettyPrinting()
                .create();
        System.out.println(gson);
        switch (jsonFileName.replace(".json", "")) {
            case "RsrvReqRq":
                RsrvReqRq rsrvReqRq = gson.fromJson(jsonFileContent, RsrvReqRq.class);
                System.out.println(rsrvReqRq.toString());
                break;
            case "RsrvReqRs":
                RsrvReqRs rsrvReqRs = gson.fromJson(jsonFileContent, RsrvReqRs.class);
                rsrvReqRs.toString();
                break;
            case "RsrvCnclRq":
                RsrvCnclRq rsrvCnclRq = gson.fromJson(jsonFileContent, RsrvCnclRq.class);
                rsrvCnclRq.toString();
                break;
            case "RsrvCnclRs":
                RsrvCnclRs rsrvCnclRs = gson.fromJson(jsonFileContent, RsrvCnclRs.class);
                rsrvCnclRs.toString();
                break;
            case "RsrvModRq":
                RsrvModRq rsrvModRq = gson.fromJson(jsonFileContent, RsrvModRq.class);
                rsrvModRq.toString();
                break;
            case "RsrvModRs":
                RsrvModRs rsrvModRs = gson.fromJson(jsonFileContent, RsrvModRs.class);
                rsrvModRs.toString();
                break;
            case "RsrvCalRq":
                RsrvCalRq rsrvCalRq = gson.fromJson(jsonFileContent, RsrvCalRq.class);
                rsrvCalRq.toString();
                break;
            case "RsrvCalRs":
                RsrvCalRs rsrvCalRs = gson.fromJson(jsonFileContent, RsrvCalRs.class);
                rsrvCalRs.toString();
                break;
        }
    }
}

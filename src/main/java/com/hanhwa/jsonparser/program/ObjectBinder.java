package com.hanhwa.jsonparser.program;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hanhwa.jsonparser.model.dto.rsrvrq.RsrvRq;
import com.hanhwa.jsonparser.model.dto.rsrvrs.RsrvRs;

public class ObjectBinder {
    public void bindingObject(String jsonFileContent, String jsonFileName){
        //.serializeNulls() .setPrettyPrinting() : toJson (직렬화 시 사용)
        // .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES) : Underscore를 CamelCase로 자동 변환 / 작동 불가 이슈
        // Object @SerializedName 설정 부여
        Gson gson = new GsonBuilder()
                .create();

       if (jsonFileName.endsWith(".json")) {
           jsonFileName = jsonFileName.replace(".json", "");
           if (jsonFileName.endsWith("Rq")) {
               RsrvRq rsrvRq = gson.fromJson(jsonFileContent, RsrvRq.class);
               System.out.println(rsrvRq.toString());
           } else if (jsonFileName.endsWith("Rs")) {
               RsrvRs rsrvRs = gson.fromJson(jsonFileContent, RsrvRs.class);
               System.out.println(rsrvRs.toString());
           }
       }
    }


}

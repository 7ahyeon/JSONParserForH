package com.hanhwa.jsonparser.program;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class JSONParserTest {

    @DisplayName("전체 JSON 파싱 프로그램 테스트")
    @Test
    void jsonParserAllTest() {
//        String str = "{  \"ds_rsrvInfo\": [            {                \"CUST_NO\": \"0000000002\",                \"MEMB_NO\": \"\",                \"CUST_IDNT_NO\": \"195176\",                \"CONT_NO\": \"\",                \"PAKG_NO\": \"\",                \"CPON_NO\": \"\",                \"LOC_CD\": \"0201\",                \"ROOM_TYPE_CD\": \"FAM\",                \"RSRV_LOC_DIV_CD\": \"S\",                \"ARRV_DATE\": \"20230528\",                \"RSRV_ROOM_CNT\": \"1\",                \"OVNT_CNT\": \"1\",                \"INHS_CUST_NM\": \"김지윤\",                \"INHS_CUST_TEL_NO2\": \"010\",                \"INHS_CUST_TEL_NO3\": \"0000\",                \"INHS_CUST_TEL_NO4\": \"0000\",                \"RSRV_CUST_NM\": \"김지윤\",                \"RSRV_CUST_TEL_NO2\": \"010\",                \"RSRV_CUST_TEL_NO3\": \"0000\",                \"RSRV_CUST_TEL_NO4\": \"0000\",                \"REFRESH_YN\": \"Y\"            }        ]    }";
//        Gson gson = new GsonBuilder()
//                .serializeNulls()
//                .setPrettyPrinting()
//                .create();
//
//        RsrvReqRq rsrvReqRq = gson.fromJson(str, RsrvReqRq.class);
//        System.out.println(rsrvReqRq.getDsRsrvinfo());

        // given (준비)
        final JSONParser jsonParser = new JSONParser();
        final JSONFileReader jsonFileReader = new JSONFileReader();
        final ObjectBinder objectBinder = new ObjectBinder();
//        final String jsonFileName = "RsrvReqRq.json";
//        final String jsonFileName = "RsrvReqRs.json";
//        final String jsonFileName = "RsrvModRq.json";
//        final String jsonFileName = "RsrvModRs.json";
//        final String jsonFileName = "RsrvCnclRq.json";
//        final String jsonFileName = "RsrvCnclRs.json";
//        final String jsonFileName = "RsrvCalRq.json";
        final String jsonFileName = "RsrvCalRs.json";


        // when (실행)
        JSONParser.jsonParsing(jsonFileName, jsonFileReader, objectBinder);

        // then (검증)

    }
}
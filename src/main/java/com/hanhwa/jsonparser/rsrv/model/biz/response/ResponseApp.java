package com.hanhwa.jsonparser.rsrv.model.biz.response;

import com.hanhwa.jsonparser.rsrv.model.biz.AppConfig;

public class ResponseApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        ResponseService responseService = appConfig.responseService();
        for (int i = 1; i <5; i++) {
            System.out.println(i);
            String jsonContent = responseService.createRequestJson(i);
            System.out.println(jsonContent);
        }
    }
}

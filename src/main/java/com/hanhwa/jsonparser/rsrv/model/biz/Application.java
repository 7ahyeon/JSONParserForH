package com.hanhwa.jsonparser.rsrv.model.biz;


import com.hanhwa.jsonparser.rsrv.model.biz.response.ResponseService;

public class Application {
    public static String application(int select) {
        AppConfig appConfig = new AppConfig();
        ResponseService responseService = appConfig.responseService();
        String jsonContent = responseService.createRequestJson(select);
        return jsonContent;
    }

}

package com.hanhwa.jsonparser.rsrv.localserver.controller;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class ServerController {

    public void postRequest() {
        try {
            URL url = new URL("http://localhost:8002/");
            HttpURLConnection http = (HttpURLConnection) url.openConnection();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

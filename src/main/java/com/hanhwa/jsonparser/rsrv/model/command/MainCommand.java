package com.hanhwa.jsonparser.rsrv.model.command;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class MainCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res){
        BufferedReader br = null;
        StringBuffer sb = null;
        String result = "N";

        try {
            br = new BufferedReader(new InputStreamReader(req.getInputStream()));
            String strData;
            sb = new StringBuffer();
            while ((strData = br.readLine()) != null) {
                System.out.println(strData);
                sb.append(strData);
            }
            br.close();
            System.out.println(sb);
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (Exception e) {
            e.printStackTrace();
        }
       //try catch io servlet
        return "/WEB-INF/view/main.jsp";
    }
}

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
       //try catch io servlet
        return "/WEB-INF/view/main.jsp";
    }
}

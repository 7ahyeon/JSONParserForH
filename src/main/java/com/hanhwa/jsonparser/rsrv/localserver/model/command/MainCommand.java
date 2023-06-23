package com.hanhwa.jsonparser.rsrv.localserver.model.command;

import com.hanhwa.jsonparser.rsrv.Application;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MainCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        Application application = new Application();
        String rsrvReqRq = application.application();
        PrintWriter out = res.getWriter();
        out.print(rsrvReqRq);

        return "/WEB-INF/view/main.jsp";
    }
}

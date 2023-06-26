package com.hanhwa.jsonparser.rsrv.model.command;

import com.hanhwa.jsonparser.rsrv.Application;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class RequestCommand implements Command {
    @Override
    public String execute(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setCharacterEncoding("UTF-8");
        res.setContentType("text/html; charset=UTF-8");

        Application application = new Application();
        String rsrvRequestRs = application.application();
        PrintWriter out = res.getWriter();
        out.print(rsrvRequestRs);

        return "/webapp/WEB-INF/view/main.jsp";
    }
}

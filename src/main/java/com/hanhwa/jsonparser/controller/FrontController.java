package com.hanhwa.jsonparser.controller;

import com.hanhwa.jsonparser.model.command.Command;
import com.hanhwa.jsonparser.model.command.MainCommand;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

// @WebServlet() : 서블릿 자동 등록(접근 경로 맵핑 어노테이션)
// *.do : 보안을 위하여 기존 서블릿 이름이 아닌 .do URL 패턴 호출
@WebServlet("*.do")
// HttpServlet :  웹 상에서 HTTP 프로토콜을 이용해 서비스를 처리하기 위해 상속
public class FrontController extends HttpServlet {
    // SUID(serialVersionUID) : 자바 직렬화 버전 값은 직접 관리해야 함(선언하지 않으면 클래스의 기본 해시값 사용)
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // getServletPath : 파일명만 가져옴
        String com = req.getServletPath();

        Command command = null;

        // 메인 페이지 이동
        if (com.equals("/main.do")) {
            command = new MainCommand();
        }

        // 커맨드 실행
        String path = command.execute(req, resp);

        // 무슨 의도로 작성했는지 예외처리 어떻게 할지 파악할 것

        if (path == null || path.endsWith(".jsp") ) {
            try {
                req.getRequestDispatcher(path).forward(req, resp);
            } catch (Exception e) {

            }
        } else {
            PrintWriter out = resp.getWriter();
            out.print(path);
            out.close();
        }

    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        // setCharacterEncoding : 응답 데이터 문자 타입 UTF-8 처리
        req.setCharacterEncoding("UTF-8");
        doGet(req, resp);
    }


}

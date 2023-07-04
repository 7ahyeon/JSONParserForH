package com.hanhwa.jsonparser.rsrv.model.command;

import com.hanhwa.jsonparser.rsrv.model.biz.deserialize.JsonToObject;
import com.hanhwa.jsonparser.rsrv.model.biz.deserialize.JsonToObjectImpl;
import com.hanhwa.jsonparser.rsrv.model.biz.response.ResponseService;
import com.hanhwa.jsonparser.rsrv.model.biz.response.ResponseServiceImpl;
import com.hanhwa.jsonparser.rsrv.model.dto.req.RsrvRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class ReceiveJsonCommand implements Command {
    @Override
    public String execute(HttpServletRequest request, HttpServletResponse response) {
        BufferedWriter bw = null;
        BufferedReader br = null;
        StringBuffer sb = null;

        try {
            br = new BufferedReader(new InputStreamReader(request.getInputStream()));
            String strData;
            sb = new StringBuffer();
            while ((strData = br.readLine()) != null) {
                sb.append(strData);
            }
            br.close();

            String jsonContent = sb.toString();
            String selecString = jsonContent.substring(jsonContent.length() - 1, jsonContent.length());
            jsonContent = jsonContent.substring(0, jsonContent.length() - 1);
            int select = Integer.valueOf(selecString);
            // 요청 JSON 수신
            System.out.println("요청 JSON 수신");
            System.out.println(jsonContent);

            JsonToObject jsonToObject = new JsonToObjectImpl();

            RsrvRequest rsrvRequest = (RsrvRequest) jsonToObject.bindingObject(jsonContent);
            System.out.println(rsrvRequest.toString());

            PrintWriter out = response.getWriter();
            ResponseService responseService = new ResponseServiceImpl();
            String sendResponse = responseService.createRequestJson(select);

            // POST 방식으로 JSON 전송
            bw = new BufferedWriter(out);
            bw.write(sendResponse);
            System.out.println("응답 JSON 전송");
            System.out.println(sendResponse);
            bw.flush();
            bw.close();

            request.setAttribute("reqqq", jsonContent);

        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            throw new RuntimeException(ex);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //try catch io servlet
        return "";
    }
}

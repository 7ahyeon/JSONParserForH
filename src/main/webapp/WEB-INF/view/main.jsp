<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
String reqs = (String)request.getParameter("reqqq");
%>
<!DOCTYPE html>
<head>
<meta charset="UTF-8">
    <title>예약 응답</title>

</head>

<body>
<input type="button" value="예약 응답" onclick="location.href='receiveJson.do' ">
    <ul>
        <li><%=reqs %></li>
        <c:forEach var="vo" items="${reqqq }">
        <li>${vo }</li>
        </c:forEach>
    </ul>
</body>

</html>
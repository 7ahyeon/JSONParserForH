<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<head>
    <title>예약 요청</title>

</head>

<body>
    <ul>
        <c:forEach var="req" items="${request }">
            <li>${req }</li>
        </c:forEach>
    </ul>
</body>

</html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: octopus
  Date: 13/02/19
  Time: 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>
</head>
<body>
    <h2>${student.firstName} ${student.lastName}</h2>
    <p>${student.country}</p>
    <strong>${student.favoriteCountry}</strong>
    <ul>
        <c:forEach var="system" items="${student.operatingSystems}">

        </c:forEach>
    </ul>
</body>
</html>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: alex
  Date: 17.02.19
  Time: 11:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<&
<html>
<head>
    <title>Add new customer</title>

    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
    <h2>Save customer</h2>

    <form:form action="/customers/save" modelAttribute="customer" method="POST">
        <form:hidden path="id"/>
        <p>
            <div>First name: </div>
            <form:input path="firstName"/>
        </p>
        <p>
            <div>Last name: </div>
            <form:input path="lastName"/>
        </p>
        <p>
            <div>Email: </div>
            <form:input path="email"/>
        </p>

        <button>Save</button>
    </form:form>
    <p>
        <a href="${pageContext.request.contextPath}/customers">Back to list</a>
    </p>
</body>
</html>

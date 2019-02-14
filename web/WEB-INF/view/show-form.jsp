<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
    <style>
        .error {
            color: red;
        }
    </style>
</head>
<body>

    <form:form action="/customers/submit" modelAttribute="customer">
        <p>
            First name: <form:input path="firstName" />
            <form:errors path="lastName" cssClass="error"/>
        </p>
        <p>
            Last name (*): <form:input path="lastName" />
            <form:errors path="lastName" cssClass="error"/>
        </p>
        <p>
            Age: <form:input path="age" />
            <form:errors path="age" cssClass="error"/>
        </p>
        <p>
            Course code <form:input path="courseCode" />
            <form:errors path="courseCode" cssClass="error"/>
        </p>
        <button type="submit">Create customer</button>
    </form:form>

</body>
</html>

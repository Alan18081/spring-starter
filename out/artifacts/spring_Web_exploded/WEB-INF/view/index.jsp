<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: octopus
  Date: 13/02/19
  Time: 10:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My title</title>
</head>
<body>
    <h2>JSP page</h2>

    <form:form action="processForm" modelAttribute="student">
        <p>
            First name <form:input path="firstName" />
        </p>
        <p>
            Last name <form:input path="lastName" />
        </p>
        <p>
            <form:select path="country">
                <form:option value="Brazil" label="Brazil" />
                <form:option value="France" label="France" />
                <form:option value="Germany" label="Germany" />
                <form:option value="India" label="India" />
            </form:select>
        </p>

        <p>
            <form:radiobutton path="favoriteCountry" value="Java"/> Java
            <form:radiobutton path="favoriteCountry" value="C#"/> C#
            <form:radiobutton path="favoriteCountry" value="JavaScript"/> JavaScript
            <form:radiobutton path="favoriteCountry" value="Dart"/> Dart
        </p>

        <p>
            <form:checkbox path="operatingSystems" value="Linux" /> Linux
            <form:checkbox path="operatingSystems" value="Mac OS"/> Mac OS
            <form:checkbox path="operatingSystems" value="Windows"/> Windows
        </p>

        <button type="submit">Submit</button>
    </form:form>

</body>
</html>

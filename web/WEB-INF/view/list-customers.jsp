<%--
  Created by IntelliJ IDEA.
  User: alex
  Date: 16.02.19
  Time: 20:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Customers</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</head>
<body>
    <h2>Customers list</h2>
    <a href="/customers/showAddForm">
        <button>Add customer</button>
    </a>
    <table>
        <tr>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Email</th>
            <th>Action</th>
        </tr>
        <c:forEach var="customer" items="${customers}">
            <c:url var="updateLink" value="/customers/showUpdateForm">
                <c:param name="customerId" value="${customer.id}" />
            </c:url>
            <c:url var="removeLink" value="/customers/remove">
                <c:param name="customerId" value="${customer.id}" />
            </c:url>
            <tr>
                <td>${customer.firstName}</td>
                <td>${customer.lastName}</td>
                <td>${customer.email}</td>
                <td>
                    <a href="${updateLink}">Update</a>
                    |
                    <a href="${removeLink}">Remove</a>
                </td>
            </tr>
        </c:forEach>


    </table>
</body>
</html>

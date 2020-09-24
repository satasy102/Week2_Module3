<%@ page import="codeGym.service.CustomerService" %>
<%--
  Created by IntelliJ IDEA.
  User: docha
  Date: 20/09/23
  Time: 1:27 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>DANH SÁCH KHÁCH HÀNG</h1>
    <table border="1" cellspacing="0">
        <thead>
        <tr>
            <th>Tên</th>
            <th>Ngày sinh</th>
            <th>Địa chỉ</th>
            <th>Ảnh</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${CustomerService.cusList}" var="element">
            <tr>
                <td><c:out value="${element.name}"/></td>
                <td><c:out value="${element.dob}"/></td>
                <td><c:out value="${element.address}"/></td>
                <td><img src="<c:url value="image/${element.url_img}" />" alt="avatar"/></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</body>
</html>

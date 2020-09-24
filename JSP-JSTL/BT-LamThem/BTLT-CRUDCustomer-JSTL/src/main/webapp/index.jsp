<%@ page import="Codegym.tin.customer.service.CustomerService" %>
<%--
  Created by IntelliJ IDEA.
  User: docha
  Date: 20/09/23
  Time: 4:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Danh sách khách hàng</title>
</head>
<body>
<a href="${pageContext.request.contextPath}/add.jsp"> Thêm khách hàng </a>

<table border="1" cellspacing="0">
    <thead>
    <tr>
        <th>Họ Tên</th>
        <th>Số điện thoại</th>
        <th>Email</th>
        <th>Ngày sinh</th>
        <th>Giới tính</th>
        <th>Địa chỉ</th>
        <th>Thao tác</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${CustomerService.customerArrayList}" var="customer">
    <tr>
        <td><c:out value="${customer.fullName}" />
        </td>
        <td><c:out value="${customer.phoneNumber}" />
        </td>
        <td><c:out value="${customer.email}" />
        </td>
        <td><c:out value="${customer.birthday}" />
        </td>
        <td><c:out value="${customer.gender}" />
        </td>
        <td><c:out value="${customer.address}" />
        </td>
        <td>
            <a href="delcus?id=<c:out value="${customer.id}"/>"> xoa </a>/
            <a href="getcus?id=<c:out value="${customer.id}"/>">sua</a>
        </td>
    </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>
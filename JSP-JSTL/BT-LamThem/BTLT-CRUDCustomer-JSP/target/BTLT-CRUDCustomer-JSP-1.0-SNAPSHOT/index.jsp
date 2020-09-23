<%@ page import="Codegym.tin.customer.model.Customer" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="static Codegym.tin.customer.service.CustomerService.customerArrayList" %>

<%--
  Created by IntelliJ IDEA.
  User: docha
  Date: 20/09/23
  Time: 4:36 PM
  To change this template use File | Settings | File Templates.
--%>
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
        <th>ID</th>
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
    <%

        ArrayList<Customer> customers = customerArrayList;

        for (Customer customer : customers) {
    %>
    <tr>
        <td><%= customer.getId() %>
        </td>
        <td><%= customer.getFullName()%>
        </td>
        <td><%= customer.getPhoneNumber() %>
        </td>
        <td><%= customer.getEmail() %>
        </td>
        <td><%= customer.getBirthday() %>
        </td>
        <td><%= customer.getGender() %>
        </td>
        <td><%= customer.getAddress() %>
        </td>
        <td>
            <form action="${pageContext.request.contextPath}/delcus" method="post">
                <button type="submit" name="id" value="<%= customer.getId() %>">Xóa</button>
            </form>
        </td>
    </tr>
    <%}%>
    </tbody>
</table>

</body>
</html>

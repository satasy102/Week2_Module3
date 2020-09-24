<%@ page import="Codegym.tin.customer.model.Customer" %>
<%@ page import="static Codegym.tin.customer.service.CustomerService.customerArrayList" %>
<%@ page import="Codegym.tin.customer.service.CustomerService" %><%--
  Created by IntelliJ IDEA.
  User: docha
  Date: 20/09/24
  Time: 9:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chỉnh sửa thông tin khách hàng</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/updatecus" method="post">
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

            int id = Integer.parseInt(request.getParameter("id"));

            CustomerService service=new CustomerService();

            Customer customer= service.findById(id);
        %>
        <tr>
            <td><%= customer.getId() %>
            </td>
            <td><input type="text" name="fullname" value="<%= customer.getFullName()%>">
            </td>
            <td><input type="text" name="phone" value="<%= customer.getPhoneNumber() %>">
            </td>
            <td><input type="email" name="email" value="<%= customer.getEmail() %>">
            </td>
            <td><input type="text" name="birthday" value="<%= customer.getBirthday() %>">
            </td>
            <td><input type="text" name="gender" value="<%= customer.getGender() %>">
            </td>
            <td><input type="text" name="address" value="<%= customer.getAddress() %>">
            </td>
            <td>
                <form action="${pageContext.request.contextPath}/updatecus" method="post">
                    <button type="submit" name="id" value="<%=customer.getId()%>">Cập nhật xong</button>
                </form>
            </td>
        </tr>
        </tbody>
    </table>
</form>
</body>
</html>

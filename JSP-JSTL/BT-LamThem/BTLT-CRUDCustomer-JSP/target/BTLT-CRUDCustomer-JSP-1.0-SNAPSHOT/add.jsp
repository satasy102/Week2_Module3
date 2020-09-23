<%--
  Created by IntelliJ IDEA.
  User: docha
  Date: 20/09/23
  Time: 7:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Thêm khách hàng</title>
</head>
<body>
    <h2>Thêm khách hàng</h2>
    <a href="index.jsp">Quay lại</a>
    <form action="${pageContext.request.contextPath}/addcus" method="post">
        <lable>Tên khách hàng</lable> <br>
        <input type="text" name="fullname" placeholder="Nhập tên"> <br>
        <lable>Số điện thoại</lable> <br>
        <input type="text" name="phone" placeholder="Nhập số điện thoại"> <br>
        <lable>Email</lable> <br>
        <input type="text" name="Email" placeholder="Nhập Email"> <br>
        <lable>Ngày sinh</lable> <br>
        <input type="text" name="birthday" placeholder="Nhập ngày sinh"> <br>
        <lable>Giới tính</lable> <br>
        <input type="text" name="gender" placeholder="Nhập giới tính"> <br>
        <lable>Địa chỉ</lable> <br>
        <input type="text" name="address" placeholder="Nhập địa chỉ"> <br>
        <button type="submit">Thêm</button>
    </form>
</body>
</html>

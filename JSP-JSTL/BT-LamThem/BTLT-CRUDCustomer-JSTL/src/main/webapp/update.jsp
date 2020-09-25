<%@ page import="Codegym.tin.customer.service.CustomerService" %><%--
  Created by IntelliJ IDEA.
  User: docha
  Date: 20/09/24
  Time: 9:37 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Chỉnh sửa thông tin khách hàng</title>
    </head>
    <body>
        <form action="updatecus" method="post">
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
                        <tr>
                            <td>
                                <input type="text" name="fullname" value="<c:out value="${customer.fullName}"/>">
                            </td>
                            <td>
                                <input type="text" name="phone" value="<c:out value="${customer.phoneNumber}"/>">
                            </td>
                            <td>
                                <input type="email" name="email" value="<c:out value="${customer.email}"/>">
                            </td>
                            <td>
                                <input type="text" name="birthday" value="<c:out value="${customer.birthday}"/>">
                            </td>
                            <td>
                                <input type="text" name="gender" value="<c:out value="${customer.gender}"/>">
                            </td>
                            <td>
                                <input type="text" name="address" value="<c:out value="${customer.address}"/>">
                            </td>
                            <td>
                            <button type="submit" name="id" value="<c:out value="${customer.id}"/>">Cập nhật xong</button>
                            </td>
                        </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>

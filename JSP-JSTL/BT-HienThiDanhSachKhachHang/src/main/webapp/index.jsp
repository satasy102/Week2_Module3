<%@ page import="java.util.ArrayList" %>
<%@ page import="CodeGym.co.Customer" %><%--
  Created by IntelliJ IDEA.
  User: docha
  Date: 20/09/23
  Time: 1:27 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    ArrayList<Customer> cusList=new ArrayList();
    Customer cus1=new Customer("Mai Văn Hoàng","1983-08-20","Hà Nội", "anh1.png");
    Customer cus2=new Customer("Nguyễn Văn Nam","1983-08-21","Bắc Giang", "anh2.png");
    Customer cus3=new Customer("Nguyễn Thái Hòa","1983-08-22","Nam Định", "anh3.png");
    Customer cus4=new Customer("Trần Đăng Khoa","1983-08-17","Hà Tây", "anh4.png");
    Customer cus5=new Customer("Nguyễn Đình Thi","1983-08-19","Hà Nội", "anh5.png");
%>
<%
    cusList.add(cus1);
    cusList.add(cus2);
    cusList.add(cus3);
    cusList.add(cus4);
    cusList.add(cus5);

%>
    <h1>DANH SÁCH KHÁCH HÀNG</h1>
    <table>
        <th>Tên</th>
        <tr>

        </tr>
        <th>Ngày sinh</th>
        <th>Địa chỉ</th>
        <th>Ảnh</th>
    </table>
</body>
</html>

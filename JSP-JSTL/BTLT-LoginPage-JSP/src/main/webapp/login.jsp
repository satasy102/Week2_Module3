<%--
  Created by IntelliJ IDEA.
  User: docha
  Date: 20/09/23
  Time: 3:23 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="condegym.co.Customer" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Page</title>
</head>
<body>
<%!
    Map<String, Customer> customerMap = new HashMap<>();
    Customer cus1 = new Customer("dochanhtin7495@gmail.com", "chanhtin123", "Do Chanh Tin");
    Customer cus2 = new Customer("volong95@gmail.com", "longvo123", "Vo Long");
    Customer cus3 = new Customer("nguyenduongdo96gmail.com", "duong123", "Nguyen Do Duong");
    Customer cus4 = new Customer("letanphuc95@gmail.com", "tanphuc123", "Le Tan Phuc");
%>

<%
    customerMap.put("dochanhtin7495@gmail.com", cus1);
    customerMap.put("volong95@gmail.com", cus2);
    customerMap.put("nguyenduongdo96gmail.com", cus3);
    customerMap.put("letanphuc95@gmail.com", cus4);

    String email = request.getParameter("email");
    String password = request.getParameter("password");
%>

<% if (customerMap.containsKey(email)) {
    Customer result = customerMap.get(email);
    if (result.getPassword().equals(password)) {
        String name = result.getFullName();
        out.print("Đăng nhập thành công. <br>");
        out.print("Chào mừng " + name + " đến với chúng tôi.");
    } else
        out.print("Sai mật khẩu");
} else out.print("Sai tài khoản");

%>
</body>
</html>

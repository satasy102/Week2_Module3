<%--
  Created by IntelliJ IDEA.
  User: docha
  Date: 20/09/16
  Time: 9:34 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cerrency Converter</title>
</head>
<body>
<h2>Currency Converter</h2>
<form method="get" action="${pageContext.request.contextPath}/convert">
    <label>Rate: </label><br/>
    <input type="text" name="rate" placeholder="RATE" value="22000"/><br/>
    <label>USD: </label><br/>
    <input type="text" name="usd" placeholder="USD" value="0"/><br/>
    <input type = "submit" id = "submit" value = "Converter"/>
</form>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: docha
  Date: 20/09/17
  Time: 8:51 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/display-discount" method="post">
    <label>Product Description</label>
    <label>
        <input type="text" name="Product Description" placeholder="Product Description">
    </label>
    <label>Price</label>
    <label>
        <input type="text" name="Price" placeholder="Price">
    </label>
    <label>Discount Percent</label>
    <label>
        <input type="text" name="Discount Percent" placeholder="Discount Percent">
    </label>
    <input type="submit" value="Result">
</form>
</body>
</html>

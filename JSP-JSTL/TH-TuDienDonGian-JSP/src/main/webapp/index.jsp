<%--
  Created by IntelliJ IDEA.
  User: docha
  Date: 20/09/23
  Time: 10:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Vietnamese Dictionary</title>
</head>
<body>
<h1>Vietnamese Dictionary</h1>
<form action="${pageContext.request.contextPath}/dictionary.jsp" method="post">
    <input type="text" placeholder="Enter your word:" name="input" id="input">
    <button type="submit" name="submit">Search</button>
</form>
</body>
</html>

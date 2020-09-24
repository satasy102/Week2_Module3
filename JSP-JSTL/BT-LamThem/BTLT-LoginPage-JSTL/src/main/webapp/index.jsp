<%--
  Created by IntelliJ IDEA.
  User: docha
  Date: 20/09/23
  Time: 3:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>Login Page</title>
    </head>
    <body>
        <form action="login" method="post">
            <h3>Email</h3>
            <input type="email" name="email" placeholder="Input your email" >
            <h3>Password</h3>
            <input type="password" name="password" placeholder="Input your password"> <br> <br>
            <button type="submit" name="login">Login</button>

        </form>

    </body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: docha
  Date: 20/09/25
  Time: 8:15 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Simple Calculator</title>
</head>
<body>
    <h1>Simple Calculator</h1>
    <form action="calculator" method="post">
        <label>First operand &nbsp; &nbsp;</label>
        <input type="text" name="num_fist"> <br>
        <label>Operator &nbsp; &nbsp;</label>
        <select name="operator">
            <option name="addition" value="+"> Addition </option>
            <option name="subtract" value="-"> Subtraction </option>
            <option name="multiply" value="x"> Multiply </option>
            <option name="division" value=":"> Division </option>
        </select> <br>
        <label>Second operand &nbsp; &nbsp;</label>
        <input type="text" name="num_second"> <br>
        <button type="submit">Calculate</button>
    </form>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Kopp
  Date: 15.12.2017
  Time: 08:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Meine erste JSP</title>
</head>
<body>
<p><font color=" red">${errorMessage}</font></p>

    <form action="/login.do" method="post">
        Name: <input type="text" name="name"/> Passwot: <input type="password" name="password"/>
        <input type="submit" value="Anmelden">

    </form>
</body>
</html>

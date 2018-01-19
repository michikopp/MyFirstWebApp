<%--
  Created by IntelliJ IDEA.
  User: Kopp
  Date: 19.01.2018
  Time: 09:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Neuer ToDo</title>
</head>
<body>

    <form action="/addTodo.do" method="post">
        Neuer ToDO: <input type="text" name="name"/>
        <input type="submit" value="Eintragen">
    </form>

</body>
</html>

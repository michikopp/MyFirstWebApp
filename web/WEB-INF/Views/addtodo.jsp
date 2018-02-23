<%--
  Created by IntelliJ IDEA.
  User: Kopp
  Date: 19.01.2018
  Time: 09:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../common/header.jspf"%>
<%@include file="../common/navigation.jspf"%>

<div class="container">
    <form action="/addTodo.do" method="post">
        Neuer ToDO: <input type="text" name="name"/>
        <input type="submit" value="Eintragen" class="btn btn-success">
    </form>
</div>

<%@include file="../common/footer.jspf"%>

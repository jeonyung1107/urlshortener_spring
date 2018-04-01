<%--
  Created by IntelliJ IDEA.
  User: jeon
  Date: 18. 4. 1
  Time: 오후 7:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/test/test.css">

    <script src="${pageContext.request.contextPath}/res/bootstrap/js/bootstrap.min.js"></script>
    <script src="http://code.jquery.com/jquery-2.1.1.min.js" type="text/javascript"></script>
</head>
<body>

<div class="container">
    <div class="jumbotron">
        <form action="/login">
            <input class="form-control" type="text" placeholder="ID"/>
            <input class="form-control" type="text" placeholder="Password"/>
            <input class="btn btn-primary" type="submit" value="로그인"/>
        </form>
    </div>
</div>

</body>
</html>

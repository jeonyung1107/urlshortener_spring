<%--
  Created by IntelliJ IDEA.
  User: jeon
  Date: 18. 2. 10
  Time: 오후 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>URLshort</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/bootstrap/css/bootstrap.min.css"/>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/res/test/test.css">

    <script src="${pageContext.request.contextPath}/res/bootstrap/js/bootstrap.min.js"></script>
    <script src="http://code.jquery.com/jquery-2.1.1.min.js" type="text/javascript"></script>
</head>

<body>
<div class="container">
    <div class="jumbotron">
        <h1>URL Shortener!!</h1>

        <form class="form-inline" action="/index" method="post">
            <div class="form-group">
                <div class="input-group center-block" style="width: 300px">
                    <span class="input-group-addon">@</span>
                    <input class="form-control" name="urlLong" type="text"/>
                </div>
                <input class="btn btn-default" type="submit" value="변환"/>
            </div>
        </form>
        <h3>${alarm}</h3>
    </div>
</div>
</body>
</html>

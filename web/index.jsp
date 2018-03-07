<%--
  Created by IntelliJ IDEA.
  User: jeon
  Date: 18. 2. 10
  Time: 오후 11:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
      <title>URLshort</title>
    </head>
    <body>
        <form action="/index" method="post">
            <input name="urlLong" type="text"/><br/>
            <input type="submit" value="변환"/>
        </form>
        <h1>${alarm}</h1>
    </body>
</html>

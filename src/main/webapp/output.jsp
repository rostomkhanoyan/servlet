<%--
  Created by IntelliJ IDEA.
  User: CocPc
  Date: 2/21/2019
  Time: 8:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>
    <%
        String answer = (String) session.getAttribute("answer");
        out.print(answer);
    %>
</h1>

</body>
</html>

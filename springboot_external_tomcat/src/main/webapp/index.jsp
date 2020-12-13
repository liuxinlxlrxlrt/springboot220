<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 86159
  Date: 2020/12/1
  Time: 22:58
  To change this template use File | Settings | File Templates.
--%>
<@<table prefix="c" uri="http://java.sun.com/jsp/jstl/core">

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach begin="1" end="100" var="sn">
    ${sn}
</c:forEach>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/17
  Time: 17:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<h4>查询所有的账户</h4>
   <c:forEach items="${list}" var="account">
        ${account.name} ${account.money}<br>

   </c:forEach>

</body>
</html>

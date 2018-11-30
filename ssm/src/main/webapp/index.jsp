<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/17
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h3>ssm你好</h3>

<a href="test/findAll">查询所有测试</a><br>
<a href="test/save">保存用户测试</a><br>

<form action="test/save" method="post">
    姓名：<input type="text" name="name"><br>
    金额：<input type="text" name="money"><br>
       <input type="submit" value="保存">
</form>

</body>
</html>

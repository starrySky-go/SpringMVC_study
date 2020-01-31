<%--
  Created by IntelliJ IDEA.
  User: 24960
  Date: 2020/1/27
  Time: 16:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%--RequestParams:用于解决传入参数与处理方法的参数不同的情况--%>
<%--<form  action="annotation/testRequestParams" method="post">--%>
<%--    姓名: <input type="text" name = "userName"><br>--%>
<%--    密码: <input type="text" name = "password"><br>--%>
<%--    <input type="submit" value="提交"><br>--%>
<%--</form>--%>

<%--@RequestBody  可以获得请求体,只适用于post方法,因为get方法没有请求体,得到的数据类型是一个key=value的类型的值--%>
<%--<form  action="annotation/testRequestBody" method="post">--%>
<%--    姓名: <input type="text" name = "userName"><br>--%>
<%--    密码: <input type="text" name = "password"><br>--%>
<%--    <input type="submit" value="提交"><br>--%>
<%--</form>--%>

<%--&lt;%&ndash;@RequestHeader可以获得请求头中某个类型的值&ndash;%&gt;--%>
<%--<form  action="annotation/testRequestHeader" method="post">--%>
<%--    姓名: <input type="text" name = "userName"><br>--%>
<%--    密码: <input type="text" name = "password"><br>--%>
<%--    <input type="submit" value="提交"><br>--%>
<%--</form>--%>


<%--@CookieValue获得cookie的值,可以使用value或者name来指明获取对应key的value
并且要求一定要有cookie--%>
<form  action="annotation/testCookieValue" method="post">
    姓名: <input type="text" name = "userName"><br>
    密码: <input type="text" name = "password"><br>
    <input type="submit" value="提交"><br>
</form>

</body>
</html>

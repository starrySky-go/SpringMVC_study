<%--
  Created by IntelliJ IDEA.
  User: 24960
  Date: 2020/1/27
  Time: 8:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>入门程序</h2>
<%--    href中的路径是相对路径--%>
<%--    <a href="hello?name=aaa">入门程序</a>--%>

<%--    当请求参数与处理方法中的参数名相同时,SpringMVC将会对方法进行自动赋值,使用反射进行赋值--%>
<%--    <a href="param/simpleParam?name=aaa&password=123">简单参数的封装示例</a>--%>

<%--
`用于传入参数为javaBean对象,在对其进行封装时,将会通过传入参数的名字使用反射来调用javaBean的setter方法进行赋值,如果名字不同,将会导致赋值失败
        <form  action="param/beanParam" method="post">--%>
<%--        姓名: <input type="text" name = "name"><br>--%>
<%--        密码: <input type="text" name= "password"><br>--%>
<%--        --%>
<%--        <input type="submit" value="提交"><br>--%>
<%--    </form>--%>


<%--用于 如果javaBean中存在一个引用类型,那么传入参数名称应该为javaBean中   引用名.属性名   ,能够调用反射来赋值--%>
<%--    <form  action="param/beanParamPlus" method="post">--%>
<%--        姓名: <input type="text" name = "name"><br>--%>
<%--        密码: <input type="text" name= "password"><br>--%>
<%--        账号: <input type="text" name = "account.idCard"> <br>--%>
<%--        剩余金额: <input type="text" name="account.money">--%>
<%--        <input type="submit" value="提交"><br>--%>
<%--    </form>--%>



<%--当javaBean对象中存在list集合和map集合时

    - list集合
    传入参数名为(属性名)list[0].名称

    <form  action="param/listParam" method="post">
        姓名: <input type="text" name = "userList[0].name"><br>
        密码: <input type="text" name= "userList[0].password"><br>


        姓名: <input type="text" name = "userList[1].name"><br>
        密码: <input type="text" name= "userList[1].password"><br>
        <input type="submit" value="提交"><br>
    </form>

     --%>

<%--
  - map集合
    传入参数为(属性名)map['key'].名称
--%>

    <form  action="param/mapParam" method="post">
        姓名: <input type="text" name = "userMap['aaa'].name"><br>
        密码: <input type="text" name = "userMap['aaa'].password"><br>


        姓名: <input type="text" name = "userMap['bbb'].name"><br>
        密码: <input type="text" name = "userMap['bbb'].password"><br>
        <input type="submit" value="提交"><br>
    </form>
</body>
</html>

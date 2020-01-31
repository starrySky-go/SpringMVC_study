package com.itheima.controller.annotation;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(path = "/annotation")
public class AnnotationController {

//     RequestParams:用于解决传入参数与处理方法的参数不同的情况
    @RequestMapping(path = "/testRequestParams")
    public String testRequestParams(@RequestParam("userName") String name, String password){
        System.out.println(name);
        System.out.println(password);
        return "success";
    }

//    @RequestBody  可以获得请求体,只适用于post方法,因为get方法没有请求体,得到的数据类型是一个key=value的类型的值
    @RequestMapping(path = "/testRequestBody")
    public String testRequestBody(@RequestBody String name){
        System.out.println(name);
        return "success";
    }
//@RequestHeader可以获得请求头
    @RequestMapping(path = "/testRequestHeader")
    public String testRequestHeader(@RequestHeader(name = "Accept") String name){
        System.out.println(name);
        return "success";
    }


    //@CookieValue获得cookie的值,可以使用value或者name来指明获取对应key的value
    //并且要求一定要有cookie
//    建立一个连接时,服务器会创建一个session,然后以cookie的形式返回一个值,用于唯一确定一个session
//sessionid是一个会话的key，浏览器第一次访问服务器会在服务器端生成一个session，有一个sessionid和它对应。
//tomcat生成的sessionid叫做jsessionid。
    @RequestMapping(path = "/testCookieValue")
    public String testCookieValue(@CookieValue(name = "JSESSIONID") String name){
        System.out.println(name);
        return "success";
    }
}

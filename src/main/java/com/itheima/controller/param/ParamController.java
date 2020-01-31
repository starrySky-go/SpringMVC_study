package com.itheima.controller.param;

import com.itheima.domain.User;
import com.itheima.domain.UserList;
import com.itheima.domain.UserMap;
import com.itheima.domain.UserPlus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/param")
public class ParamController {
//1. 当请求参数与处理方法中的参数名相同时,SpringMVC将会对方法进行自动赋值,使用反射进行赋值
    @RequestMapping(path = "/simpleParam")
    public String simpleParam(String name,String password){
        System.out.println(name);
        System.out.println(password);
        return "success";
    }

//    2. 传入参数为javaBean对象,在对其进行封装时,将会通过传入参数的名字使用反射来调用javaBean的setter方法进行赋值,如果名字不同,将会导致赋值失败

    @RequestMapping(path = "/beanParam")
    public String beanParam(User user){
        System.out.println(user);
        return "success";
    }
    //如果javaBean中存在一个引用类型,那么传入参数名称应该为javaBean中   引用名.属性名   ,能够调用反射来赋值
    @RequestMapping(path = "/beanParamPlus")
    public String beanParamPlus(UserPlus user){
        System.out.println(user);
        return "success";
    }
//    当javaBean对象中存在list集合和map集合时
//    - list集合
//    传入参数名为(属性名)list[0].名称
    @RequestMapping(path = "/listParam")
    public String listParam(UserList userList){
        System.out.println(userList);
        return "success";
    }
//- map集合
//    传入参数为(属性名)map['key'].名称
    @RequestMapping(path = "/mapParam")
    public String mapParam(UserMap userMap){
        System.out.println(userMap);
        return "success";
    }
}

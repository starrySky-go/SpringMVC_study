package com.itheima.controller.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller

public class HelloController {


    @RequestMapping(path = "/hello",method = {RequestMethod.POST,RequestMethod.GET},params = {"name=bbb"})
    public String sayHello(){
        System.out.println("开启处理请求");
        return "success";
    }
}

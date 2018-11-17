package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HelloController {
    @RequestMapping("/hi/{name}")
    public String  hi(@PathVariable String name) {
        log.info("info:{}，路径：{},姓名：{}","收到请求","/hi",name);
        log.error("error:{},信息：{}","错误日志","测试错误日志消息");
        return "hello:"+name;
    }
}

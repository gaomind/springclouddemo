package com.ptteng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ${MIND-ZR} on 2018/1/5.
 */
@RestController
public class Controller {

    @Value("${spring.application.name}")
    private String serverName;
    @Autowired
    DiscoveryClient client;
    @RequestMapping("/callToXiaoAI")
    public String getMessage(){
        System.out.println("小爱同学在此！！！！！！！！！！！！！！！！！！！！！！！！！！");
        return "你好! 我是小Bi同学，编号BI1001, 我服务器的名称是:" + serverName + "=====";
    }
}
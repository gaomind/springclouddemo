package com.ptteng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ${MIND-ZR} on 2018/1/5.
 */
@RestController
public class HelloConsumer {

    @Autowired
    ServiceClient serviceClient;

    @RequestMapping("/feign-consumer")
    public String helloConsumer(){
        String returnMessage = serviceClient.getHelloService1();
        System.out.println(returnMessage);
        return "returnMessage";
    }
}

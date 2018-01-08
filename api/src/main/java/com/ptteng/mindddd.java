package com.ptteng;


import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ${MIND-ZR} on 2018/1/5.
 */


public interface mindddd {

    //@RequestMapping("/callToXiaoAI")
   // String getHelloService1();

    @RequestMapping("/mind")
    Car getHelloService1();

}

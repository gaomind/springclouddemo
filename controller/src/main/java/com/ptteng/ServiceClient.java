package com.ptteng;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ${MIND-ZR} on 2018/1/5.
 */
@FeignClient("hello-service1")
public interface ServiceClient {



    @RequestMapping("/callToXiaoAI")
    String getHelloService1();


}

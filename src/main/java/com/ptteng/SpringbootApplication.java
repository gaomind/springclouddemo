package com.ptteng;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class SpringbootApplication {


	@FeignClient("mind")
	interface HelloMindddd extends mindddd {
	}

	@RestController
	public class Controller {
		//    @FeignClient("eureka-feign-client")
//    interface helloservice extends mindddd{};
//    @Autowired
//    mindddd serviceClient;
		@Autowired
		private HelloMindddd helloServiceClient;

		@RequestMapping("/test")
		public Car helloConsumer() {
			Car returnMessage = helloServiceClient.getHelloService1();
			System.out.println(returnMessage);
			return returnMessage;
		}
	}

	public static void main(String[] args) {
		 SpringApplication.run(SpringbootApplication.class, args);
	}
}


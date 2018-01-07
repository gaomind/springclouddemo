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


	@FeignClient("hello-service1")
	interface  HelloServiceClient extends ServiceClient{
	}

	@RestController
	public class Controller {
		//    @FeignClient("eureka-feign-client")
//    interface helloservice extends ServiceClient{};
//    @Autowired
//    ServiceClient serviceClient;
		@Autowired
		private HelloServiceClient helloServiceClient;

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


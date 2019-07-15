package com.hkafeidou.springcloudproviderdept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
public class SpringCloudProviderDeptApp_01 {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudProviderDeptApp_01.class, args);
	}
}

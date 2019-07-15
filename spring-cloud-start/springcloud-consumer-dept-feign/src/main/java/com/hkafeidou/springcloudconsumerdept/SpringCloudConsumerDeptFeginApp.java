package com.hkafeidou.springcloudconsumerdept;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.hkafeidou.springcloudsimple.infrastructure.service"})
public class SpringCloudConsumerDeptFeginApp {
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsumerDeptFeginApp.class, args);
	}
}

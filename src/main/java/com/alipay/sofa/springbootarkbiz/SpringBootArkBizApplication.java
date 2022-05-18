package com.alipay.sofa.springbootarkbiz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@ImportResource({ "classpath*:META-INF/spring/service.xml" })
@SpringBootApplication(exclude = JacksonAutoConfiguration.class)
public class SpringBootArkBizApplication {

	public static void main(String[] args) {
//		SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringBootArkBizApplication.class).web(WebApplicationType.NONE);
//		ConfigurableApplicationContext context = builder.build().run(args);
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootArkBizApplication.class, args);
		System.out.println("SpringBootArkBizApplication start!");
		System.out.println("SpringBootArkBizApplication spring boot version: " + SpringApplication.class.getPackage().getImplementationVersion());
		System.out.println("SpringBootArkBizApplication classLoader: " + SpringBootArkBizApplication.class.getClassLoader());
	}
}

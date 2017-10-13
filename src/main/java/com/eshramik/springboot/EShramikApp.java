package com.eshramik.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.scheduling.annotation.EnableAsync;

import com.eshramik.springboot.configuration.JpaConfiguration;


@Import(JpaConfiguration.class)
@SpringBootApplication(scanBasePackages={"com.eshramik.springboot"})// same as @Configuration @EnableAutoConfiguration @ComponentScan
@EnableAsync
public class EShramikApp {

	public static void main(String[] args) {
		SpringApplication.run(EShramikApp.class, args);
	}
}

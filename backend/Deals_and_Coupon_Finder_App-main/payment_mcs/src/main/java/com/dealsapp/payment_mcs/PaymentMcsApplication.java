 package com.dealsapp.payment_mcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableDiscoveryClient
@EnableWebMvc
public class PaymentMcsApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentMcsApplication.class, args);
	}

}

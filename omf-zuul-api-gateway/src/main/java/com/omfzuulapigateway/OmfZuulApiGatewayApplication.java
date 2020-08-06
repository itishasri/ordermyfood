package com.omfzuulapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class OmfZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmfZuulApiGatewayApplication.class, args);
	}

}

package com.omfeurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class OmfEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmfEurekaServerApplication.class, args);
	}

}

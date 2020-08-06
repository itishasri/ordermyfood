package com.omfconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

//author Itisha
@EnableConfigServer
@SpringBootApplication
public class OmfConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmfConfigServiceApplication.class, args);
	}

}

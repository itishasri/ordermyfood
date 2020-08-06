package com.omfsearchservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import com.omfsearchservice.config.JwtFilter;

@SpringBootApplication
@EnableCaching
public class OmfSearchServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(OmfSearchServiceApplication.class, args);
	}
	
	@Bean
	public FilterRegistrationBean jwtFilter() {
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new JwtFilter());
		registrationBean.addUrlPatterns("/restaurant/*", "/restaurants/*","/item/");

		return registrationBean;
	}
}

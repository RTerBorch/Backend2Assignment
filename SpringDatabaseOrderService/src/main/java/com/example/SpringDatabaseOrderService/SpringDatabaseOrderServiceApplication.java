package com.example.SpringDatabaseOrderService;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Order Service", version = "1.0", description = "Order Managment"))
public class SpringDatabaseOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDatabaseOrderServiceApplication.class, args);
	}

	@Bean
	RestTemplate restTemplate() {
		RestTemplate restTemplate = new RestTemplate();
		return restTemplate;
	}

	@Value("${security-user.password}")
	String password;

	@Bean
	public UserDetailsService userDetailsService() {
		UserDetails user = User.withUsername("user")
				.password(PasswordEncoderFactories.createDelegatingPasswordEncoder().encode(password))
				.roles("USER")
				.build();
		return new InMemoryUserDetailsManager(user);
	}
}

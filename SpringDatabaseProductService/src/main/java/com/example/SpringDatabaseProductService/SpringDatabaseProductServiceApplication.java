package com.example.SpringDatabaseProductService;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Product Service", version = "1.0", description = "Product Management"))
public class SpringDatabaseProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDatabaseProductServiceApplication.class, args);
	}

}

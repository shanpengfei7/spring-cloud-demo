package com.pnfy.study.servermiya;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@RestController
public class ServerMiyaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerMiyaApplication.class, args);
	}

	@RequestMapping("hi")
	public String home() {
		return "hi, I'm miya!";
	}

	@RequestMapping("miya")
	public String info() {
		return restTemplate.getForObject("http://localhost:8988/info", String.class);
	}

	@Autowired
	private RestTemplate restTemplate;

	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}

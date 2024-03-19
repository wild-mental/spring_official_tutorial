package com.example.official_tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication  // Configuration, EnableAutoConfiguration, ComponentScan, SpringBootConfiguration, EnableWebMvc, webMvcAutoConfiguration
@RestController
public class OfficialTutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(OfficialTutorialApplication.class, args);
	}
	@RequestMapping(value="/hello", method= RequestMethod.GET)
	public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
		return String.format("Hello %s!", name);
	}
	// 스프링 실행 후 아래에 있는 링크를 browser 에 입력해 결과 확인
	// http://localhost:8080/hello?name=YourName
}

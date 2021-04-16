package com.example.apiserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ApiServerApplication {
@GetMapping("server")
public  String  gettring(){
	return  "module 1";
}
	public static void main(String[] args) {
		SpringApplication.run(ApiServerApplication.class, args);
	}

}

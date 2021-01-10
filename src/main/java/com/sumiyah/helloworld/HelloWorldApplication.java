package com.sumiyah.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication.class, args);
	}
	
	@GetMapping("/")
	public String index() {
		return "<p>Hello world, this is the root route!!</p>";
	}
	
	@GetMapping("/random")
	public String random() {
		return "<h4>Hello world, we are in the random route!</h4>"
				+ "<h5>Hope this was fun for you <3</h5>";
	}
	
	//<c:forEach items="${messages}" var="msg">
//    <p>${msg}</p>
//    </c:forEach>

}

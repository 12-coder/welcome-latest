package com.example.demo.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value = "Swagger2WelcomeRestController", description = "This REST Api related to Welcome Message!!!!")
@RestController
public class WelcomeRestController {

	@ApiOperation(value = "Get Welcome Message For The Given Name ", response = String.class, tags = "getWelcomeNote")
	@GetMapping("/welcome/{name}")
	public String welcome(@PathVariable("name") String name) {
		return name+", Welcome to my spring boot app";
	}
	public List<Topic> listOfCourses() {
		List<Topic> l = new ArrayList<Topic>();

		l.add(new Topic(1, "spring framework", "spring framework description"));
		l.add(new Topic(2, "core java", "core java description"));
		l.add(new Topic(3, "javascript", "javascript description"));
		return l;
	}

	@GetMapping("/topics")
	public String getAllTopics() {
		List<Topic> l=listOfCourses();
		return l;
	}
	
	@ApiOperation(value = "Get Welcome Message For The Given Name ", response = String.class, tags = "getWelcomeNote")
	@GetMapping("/hi")
	public String hi() {
		return "hello";
	}



}

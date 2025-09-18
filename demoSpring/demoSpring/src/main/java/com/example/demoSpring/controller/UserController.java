package com.example.demoSpring.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
import Model.User;

@RestController
public class UserController {
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return Arrays.asList(
				new User(1,"Alice","alice@example.com"),
				new User(2,"Bob","bob@example.com"),
				new User(3,"Charlie","charlie@example.com"));
	}
	

}
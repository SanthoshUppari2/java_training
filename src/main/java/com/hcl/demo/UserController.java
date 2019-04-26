package com.hcl.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/user")
public class UserController {
	
	@GetMapping(value="/getUsers")
	public List<User> getUsers(){
		
		List<User> users = new ArrayList<User>();
		User user = new User();
		user.setId(1);
		user.setName("HCL");
		users.add(user);
		
		user = new User();
		user.setId(2);
		user.setName("BNG");
		users.add(user);
		
		return users;
	}

}

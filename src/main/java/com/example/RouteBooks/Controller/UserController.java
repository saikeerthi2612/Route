package com.example.RouteBooks.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.RouteBooks.Entity.User;
import com.example.RouteBooks.Service.UserService;

@RestController
public class UserController {
	
	@Autowired 
	private UserService userservice;
	
	@PostMapping("/create")
	public User saveUser(@RequestBody User user) {
		return userservice.saveUser(user);
		
	}
	@GetMapping("/getuser/{userid}")
	public User getById(@PathVariable Long userid) {
		return userservice.getById(userid);
		
	}
	@GetMapping("/getallusers")
	public  List<User> getAllUsers(){
		return userservice.getAllUsers();
		
	}

	@PutMapping("/edit/{userid}")
	public User updateDetails(@RequestBody User user,@PathVariable Long userid){
		return userservice.updateDetails(user,userid);
		
	}
	@DeleteMapping("/delete/{userid}")
	public String deleteUser(@PathVariable Long userid){
		return userservice.deleteUser(userid);
		
	}
	
	 



}

package com.example.RouteBooks.Service;

import java.util.List;

import com.example.RouteBooks.Entity.User;



public interface UserService {
	public User saveUser(User user);
	public User getById(Long userid);
	public List<User> getAllUsers();
	public User updateDetails(User user,Long userid);
	public String deleteUser(Long userid);


}

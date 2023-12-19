package com.example.RouteBooks.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.RouteBooks.Entity.User;
import com.example.RouteBooks.Repository.UserRepo;

@Service
public class UServiceImpl implements UserService {
	
	@Autowired 
	private UserRepo userrepo;

	@Override
	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return userrepo.save(user);
	}

	@Override
	public User getById(Long userid) {
		// TODO Auto-generated method stub
		return userrepo.findById(userid).get();
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userrepo.findAll();
	}

	@Override
	public User updateDetails(User user, Long userid) {
		// TODO Auto-generated method stub
		User updateUser=userrepo.findById(user.getUserid()).orElse(null);
		if(updateUser!=null) {
			updateUser.setName(user.getName());
			updateUser.setEmail(user.getEmail());
			updateUser.setPassword(user.getPassword());
			
			userrepo.save(updateUser);
			return updateUser;
		}
		return null;
	}

	@Override
	public String deleteUser(Long userid) {
		// TODO Auto-generated method stub
		userrepo.deleteById(userid);
		return "deleted user with this id " +userid;
	}

}

package com.business.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.business.entities.User;
import com.business.repositories.UserRepository;

@Component
public class UserService
{
	@Autowired
private UserRepository userRepository;
	//Get All Users
		public List<User> getAllUser()
		{
			List<User> users = (List<User>) this.userRepository.findAll();
			return users;
		}
		
		//Get Single User
		public User getUser(int id)
		{
			Optional<User> optional = this.userRepository.findById(id);
			User user = optional.get();
			return user;
		}
		
		//Update
		public void updateUser(User user,int id)
		{
			user.setUserId(id);
			 this.userRepository.save(user);
		}
		
		//delete single User
		public void deleteUser(int id)
		{
			this.userRepository.deleteById(id);
		}

		//Add User
		public void addUser(User user)
		{
		this.userRepository.save(user);
		}
		
		
}

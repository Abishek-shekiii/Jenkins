package com.abishek.service;

import org.springframework.stereotype.Service;

import com.abishek.model.User;
import com.abishek.repoistory.UserRepoistory;

@Service
public class UserService 
{
	private UserRepoistory userRepoistory;

	public UserService(UserRepoistory userRepoistory) {
		super();
		this.userRepoistory = userRepoistory;
	}
	
	public User createUser(User user) {
		return userRepoistory.save(user);
	}
	
//	public User UpdateUser(User user) {
//		return userRepoistory.
//	}
}

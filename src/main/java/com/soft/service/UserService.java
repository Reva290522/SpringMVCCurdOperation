package com.soft.service;

import java.util.List;

import com.soft.entity.User;

public interface UserService {

	public int saveUserService(User user);

	public List<User> getAllUsereService();

	public void deleteByIdService(int userId);
	
	public User getuserByIdService(int id);

	public void updateExistUserService(User user);
}

package com.soft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.soft.dao.UserDAO;
import com.soft.entity.User;

@Component
public class UserServiceImp implements UserService{

	@Autowired
	private UserDAO userDAO;
	
	@Override
	public int saveUserService(User user) {
		
		return userDAO.saveUserDAO(user);
	}

	@Override
	public List<User> getAllUsereService() {
		
		return userDAO.getAlluserDAO();
	}

	@Override
	public void deleteByIdService(int userId) {
	
		userDAO.deleteByIdDAO(userId);
		
	}

	@Override
	public User getuserByIdService(int userId) {
		
		return userDAO.getByIdDAO(userId);
	}

	@Override
	public void updateExistUserService(User user) {
		
		 userDAO.updateExistUserDAO(user);
	}
}
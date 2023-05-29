package com.soft.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.soft.entity.User;
import com.soft.service.UserService;

import java.util.List;


@Controller
public class UserController {

	@Autowired
	private UserService userService;
	@RequestMapping(value ="/saveUser",method = RequestMethod.POST )
	public String saveUSer(@ModelAttribute User user) {
		
		int savedUserId = userService.saveUserService(user);
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("SavedUserId", savedUserId);
		String displayUrl = "/getAllUser";
		return"redirect:"+displayUrl;
	}
	
	@RequestMapping(value = "/getAllUser",method = RequestMethod.GET)
	public ModelAndView getAllUsers() {
		
		java.util.List<User> userList =  userService.getAllUsereService();
		
		System.out.println(userList);
	
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("userList", userList);
		
		mav.setViewName("display");
		
		return mav;
	}
	
	@RequestMapping(value="/deleteById" , method = RequestMethod.GET)
	public String deleteById(@RequestParam int id) {
		
		userService.deleteByIdService(id);
		ModelAndView mav = new ModelAndView();
		String displayUrl = "/getAllUser";
		return "redirect:"+displayUrl;
	}
	
	@RequestMapping(value = "/updateUserForm")
	public ModelAndView updateUserForm(@RequestParam int id) {

		ModelAndView mav = new ModelAndView();

		User existUser = userService.getuserByIdService(id);

		System.out.println(existUser);

		mav.addObject("ExistUser", existUser);
		mav.setViewName("updateUser");

		return mav;
	}

	@RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	public String updateExistUser(@ModelAttribute User user) {

		ModelAndView mav = new ModelAndView();
		userService.updateExistUserService(user);
		String displayUrl = "/getAllUser";

		return "redirect:" + displayUrl;
	}
}

package com.qiuhui.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qiuhui.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {

	@GetMapping("/new")
	public String userNew() {
		
		return "/user/new";
	}
	
	@PostMapping("/new")
	public String newUser(String username,String useraddress) {
		
		System.out.println(username +"---->"+ useraddress);
		return "redirect:/user/list";
	}
		
	@GetMapping("/list")
	public String userList(Model model) {
		
		List<User> userList = Arrays.asList(new User("aa","aaa"),
				new User("bb","bbb"),
				new User("cc","ccc"),
				new User("dd","ddd")
				);
		model.addAttribute("userList",userList);
		
		return "/user/list";
	}
	
}

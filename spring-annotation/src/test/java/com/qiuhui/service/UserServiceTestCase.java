package com.qiuhui.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTestCase {

	
	@Test
	public void save() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		UserService userService = (UserService)applicationContext.getBean("userService");
		userService.save();
	}
	
}

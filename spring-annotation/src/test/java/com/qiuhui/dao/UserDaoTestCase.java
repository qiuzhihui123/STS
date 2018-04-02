package com.qiuhui.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserDaoTestCase {

	@Test
	public void save() {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		
		UserDao userDao = (UserDao)applicationContext.getBean("userDao");
			
		userDao.save();
	}
	
}

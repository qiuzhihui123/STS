package com.qiuhui.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentServiceTestCase {

	
	@Test
	public void save() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/IOC.xml");
	
		StudentService stuService = (StudentService)applicationContext.getBean("studentService");
		
		stuService.save();
	
	}
	
	@Test
	public void again(){
		ApplicationContext applicationContext = new  ClassPathXmlApplicationContext("spring/applicationContext.xml");
		StudentService studentService = (StudentService)applicationContext.getBean("studentService");
		
		studentService.save();
		
	}
	
	
	
}

package com.qiuhui.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OtherServiceTestCase {
	
	
	@Test
	public void show() {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/IOC.xml");
		OtherService otherService = (OtherService)applicationContext.getBean("otherService");
		otherService.show();
	}

}

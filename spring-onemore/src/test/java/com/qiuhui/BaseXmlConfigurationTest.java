package com.qiuhui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseXmlConfigurationTest {

	protected  static ApplicationContext applicationContext;
	
	
		static {
			applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		}
	
	
	
}

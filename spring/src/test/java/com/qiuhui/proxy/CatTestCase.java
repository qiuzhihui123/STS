package com.qiuhui.proxy;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CatTestCase {

	
	@Test
	public void cat() {
		ApplicationContext applicationContext  = new ClassPathXmlApplicationContext("spring/aop.xml");
		
		Animal animal = (Animal)applicationContext.getBean("cat");
		
		animal.bark();
		
		System.out.println("--------------------");
		animal.stop();
		
		
		
	}
	
}

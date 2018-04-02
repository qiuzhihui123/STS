package com.qiuhui;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BaseAnnotationConfigurationTest {

	protected static ApplicationContext applicationContext;
	
	static {
		applicationContext  = new AnnotationConfigApplicationContext(Application.class);
	}
	
}

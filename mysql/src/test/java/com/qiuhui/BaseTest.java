package com.qiuhui;

import javax.inject.Inject;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qiuhui.dao.UserDao;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=Application.class)
public class BaseTest {

	@Inject
	protected  UserDao userDao;
	
	static {
		/*ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-jdbc.xml");
		userDao = (UserDao)applicationContext.getBean("userDao");*/
		
	}
	
	
	
}

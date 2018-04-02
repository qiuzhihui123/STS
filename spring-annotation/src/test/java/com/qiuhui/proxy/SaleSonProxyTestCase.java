package com.qiuhui.proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.qiuhui.Application;
import com.qiuhui.interfaces.SaleFather;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=Application.class)
//@ContextConfiguration(locations="classpath:spring.xml")
public class SaleSonProxyTestCase {

	@Autowired
	private SaleFather saleSon;
	
	
	@Test
	public void sale() {
		
		saleSon.sale();
	}
	
	
	
}

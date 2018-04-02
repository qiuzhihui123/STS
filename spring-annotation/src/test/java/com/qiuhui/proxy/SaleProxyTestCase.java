package com.qiuhui.proxy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring.xml")
public class SaleProxyTestCase {

	@Autowired
	private Sale sale;
	
	@Test
	public void sale() {
		
		sale.sale();
		
	}
	
}

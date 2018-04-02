package com.qiuhui.proxy;

import org.junit.Test;

import com.qiuhui.BaseXmlConfigurationTest;

public class CatProxyTestCase extends BaseXmlConfigurationTest{

	
	@Test
	public void bark() {
		Cat cat = (Cat)applicationContext.getBean("cat");
		cat.bark();
		System.out.println(cat.getClass().getName());
	}
	
}

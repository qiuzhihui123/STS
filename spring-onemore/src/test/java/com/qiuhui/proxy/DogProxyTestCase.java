package com.qiuhui.proxy;

import org.junit.Test;

import com.qiuhui.BaseAnnotationConfigurationTest;
import com.qiuhui.interfaces.Animal;

public class DogProxyTestCase extends BaseAnnotationConfigurationTest{

	@Test
	public void dog() {
		Animal animal = (Animal)applicationContext.getBean("dog");
		animal.climb();
	}
	
}

package com.qiuhui.proxy;

import javax.inject.Inject;

import org.junit.Test;

import com.qiuhui.BaseAutoloadSpringConfiguration;
import com.qiuhui.interfaces.Animal;

public class DogAutoloadTestCase extends BaseAutoloadSpringConfiguration{

	@Inject
	private Animal animal;
	
	
	@Test
	public void dog() {
		animal.climb();
		System.out.println(animal.getClass().getName());
	}
	
	
}

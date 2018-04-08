package com.qiuhui.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.qiuhui.BaseTest;
import com.qiuhui.entity.Product;

public class ProductServiceTestCase extends BaseTest{

	@Autowired
	private ProductService productService;
	
	@Test
	public void findById() throws Exception {
		Product product = productService.findById(2177);
		System.out.println(product);
	}
	
	
}

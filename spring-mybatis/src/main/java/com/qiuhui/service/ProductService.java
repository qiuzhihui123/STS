package com.qiuhui.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qiuhui.dao.ProductDao;
import com.qiuhui.entity.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	public Product findById(int id) throws Exception {
		return productDao.findById(id);
	}

}

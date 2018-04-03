package com.qiuhui.dao;

import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.qiuhui.BaseTest;
import com.qiuhui.entity.User;

public class UserDaoTestCase extends BaseTest{

	
	@Test
	public void save() {
		
		User user = new User("小傻瓜","26");
		userDao.save(user);
	}
	
	@Test
	public void findById() {
		User user = userDao.findById(4);
		System.out.println(user);
		
	}
	
	@Test 
	public void findAll() {
		List<User> userList = userDao.findAll();
		for(User user : userList) {
			System.out.println(user);
		}
	}
	
	@Test
	public void count() {
		int num = userDao.count();
		System.out.println("当前我一共有"+num+"条数据");
	}
	
	@Test
	public void findAllMap() {
		List<Map<String,Object>> mapList = userDao.getMap();
		for(Map<String ,Object> map : mapList) {
			for(Map.Entry<String, Object>  entry: map.entrySet()) {
				System.out.println(entry.getKey()+"----"+entry.getValue());
			}
		}
	}
	
	
	
}

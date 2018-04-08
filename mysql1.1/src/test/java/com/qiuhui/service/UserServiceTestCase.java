package com.qiuhui.service;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.junit.Test;

import com.qiuhui.BaseTest;
import com.qiuhui.entity.User;

public class UserServiceTestCase extends BaseTest{

	@Resource
	private UserService userService;
	
	
	@Test
	public void transactionTest() throws Exception  {
		List<User> userList = Arrays.asList(new User("Ð¡¹·1","¹þ¹þ"),
				new User("Ð¡¹·2","¹þ¹þ"));
		
		userService.saveByList(userList);
	}
	
	@Test
	public void save() {
		User user = new User("ËÉÆÂ","Éµ±Æ");
		userService.save(user);
	}
	
	@Test
	public void findUserById() {
		User user = userService.findUserById(44);
		System.out.println(user);
	}
	
	
	@Test
	public void findAll() {
		List<User> userList = userService.findAll();
		for(User user : userList) {
			System.out.println(user);
		}
	}
	
	@Test
	public void findMap() {
		List<Map<String,Object>> mapList = userService.findMap();
		for(Map<String,Object> map : mapList) {
			for(Map.Entry<String,Object> entry : map.entrySet()) {
				System.out.println(entry.getKey() + "----" + entry.getValue());
			}
		}
	}
	
	@Test
	public void batchSave() {
		
		List<User> userList = Arrays.asList
				(new User("Ð¡Éµ¹Ï","ºÙºÙºÙ"),
						new User("´óÉµ¹Ï","ºÙºÙºÙ"),
							new User("Éµ¹Ï","ºÙºÙºÙ"));
		
		userService.batchSave(userList);
	}
	
	/*@Test
	public void namedParameterJdbcTemplateSave() {
		User user = new User("¹þ¹þ¹þ¹þ¹þ¹þ","ºÇºÇºÇºÇºÇºÇ");
		userService.namedParameterJdbcTemplateSave(user);
	}*/
	
	
}

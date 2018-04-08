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
		List<User> userList = Arrays.asList(new User("С��1","����"),
				new User("С��2","����"));
		
		userService.saveByList(userList);
	}
	
	@Test
	public void save() {
		User user = new User("����","ɵ��");
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
				(new User("Сɵ��","�ٺٺ�"),
						new User("��ɵ��","�ٺٺ�"),
							new User("ɵ��","�ٺٺ�"));
		
		userService.batchSave(userList);
	}
	
	/*@Test
	public void namedParameterJdbcTemplateSave() {
		User user = new User("������������","�ǺǺǺǺǺ�");
		userService.namedParameterJdbcTemplateSave(user);
	}*/
	
	
}

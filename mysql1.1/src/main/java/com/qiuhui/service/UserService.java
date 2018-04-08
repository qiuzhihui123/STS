package com.qiuhui.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.qiuhui.dao.UserDao;
import com.qiuhui.entity.User;

@Service
public class UserService {

	@Resource
	private UserDao userDao;
	
	@Transactional(rollbackFor=Exception.class)
	public void saveByList(List<User> userList) throws Exception {
		for(int i = 0; i<userList.size(); i++) {
			userDao.save(userList.get(0));
			/*throw new Exception();*/
			throw new Exception();
		}
	}
	
	public void save(User user) {
		
		userDao.save(user);
	}

	public User findUserById(int id) {
	return userDao.findUserById(id);
		
	}

	public List<User> findAll() {
		
		return userDao.findAll();
	}

	public List<Map<String, Object>> findMap() {
		return userDao.findMap();
	}

	public void batchSave(List<User> userList) {
		userDao.batchSave(userList);
		
	}

	/*public void namedParameterJdbcTemplateSave(User user) {
		userDao.namedParameterJdbcTemplateSave(user);
	}*/
	
}

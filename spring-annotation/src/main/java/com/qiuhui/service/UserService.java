package com.qiuhui.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.qiuhui.dao.UserDao;

@Service
/*@Lazy
@Scope("prototype")*/
public class UserService {
	
	@Inject
	private UserDao userDao;
	
	
	/*@Autowired
	
	@Resource
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}*/

	public void save() {
		userDao.save();
	}
	
	
}

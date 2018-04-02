package com.qiuhui.service;

import com.qiuhui.dao.StudentDao;

public class StudentService {

	
	
	private StudentDao studentDao;
	private String name;
	
	
	
	public StudentService(){
		
	}
	
	
	public StudentService(String name,StudentDao studentDao){
		
		System.out.println("构造方法,我的名字是:" + name );
		this.studentDao = studentDao;
	}
	
	public void save(){
		
		studentDao.save();
	}
	
	public void setStudentDao(StudentDao studentDao){
		
		this.studentDao = studentDao;
		System.out.println("set方法");
	}
	
}

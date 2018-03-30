package com.qiuhui.service;

import com.qiuhui.dao.StudentDao;

public class StudentService {

	private StudentDao studentDao;
	
	
	
	
	public StudentService(StudentDao studentDao){
		System.out.println("构造方法");
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

package com.qiuhui.service;

import com.qiuhui.dao.StudentDao;

public class StudentService {

	
	
	private StudentDao studentDao;
	private String name;
	
	
	
	public StudentService(){
		
	}
	
	
	public StudentService(String name,StudentDao studentDao){
		
		System.out.println("���췽��,�ҵ�������:" + name );
		this.studentDao = studentDao;
	}
	
	public void save(){
		
		studentDao.save();
	}
	
	public void setStudentDao(StudentDao studentDao){
		
		this.studentDao = studentDao;
		System.out.println("set����");
	}
	
}

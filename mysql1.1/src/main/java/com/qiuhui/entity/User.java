package com.qiuhui.entity;

import org.springframework.stereotype.Repository;


public class User {

	private	Integer id;
	private String name;
	private String age;
	
	
	public User() {
		
	}
	
	public User(String name,String age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
	
}

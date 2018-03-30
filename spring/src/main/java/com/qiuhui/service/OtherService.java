package com.qiuhui.service;

import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import com.qiuhui.dao.StudentDao;

public class OtherService {

	private Integer id;
	private String name;
	private double score;
	private List<String> nameList;
	private Set<Integer> set;
	private Map<String,StudentDao> map;
	private Properties properties;
	
	public void show() {
		System.out.println(id);
		System.out.println(name);
		System.out.println(score);
		
		for(String str : nameList) {
			System.out.println(str);
		}
		
		for(Integer i :set) {
			System.out.println(i);
			
		}
		
		for(Map.Entry<String, StudentDao> entry : map.entrySet()) {
			System.out.println(entry.getKey() + "--->"+entry.getValue());
		}
		
		Enumeration enumeration = properties.keys();
		
		while(enumeration.hasMoreElements()) {
			Object key = enumeration.nextElement();
			Object value = properties.getProperty((String)key);
			
			System.out.println(key +"---->"+value);
		}
		
		
		
		
		
	}
	
	
	public void setId(Integer id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public void setNameList(List<String> nameList) {
		this.nameList = nameList;
	}
	public void setSet(Set<Integer> set) {
		this.set = set;
	}
	public void setMap(Map<String, StudentDao> map) {
		this.map = map;
	}
	public void setProperties(Properties properties) {
		this.properties = properties;
	}
	
	
	
}

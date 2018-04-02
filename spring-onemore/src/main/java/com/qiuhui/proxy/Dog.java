package com.qiuhui.proxy;

import javax.inject.Named;

import com.qiuhui.interfaces.Animal;

@Named
public class Dog implements Animal{

	@Override
	public void climb() {
		System.out.println("我是一只会爬树的狗子");
	}
	
	
}

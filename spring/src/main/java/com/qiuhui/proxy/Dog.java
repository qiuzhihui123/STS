package com.qiuhui.proxy;

public class Dog implements Animal{

	public void bark() {
		try {
		System.out.println("����");
		throw new ClassCastException();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public int stop() {
		return 1111111111 ;
	}

	
	
}

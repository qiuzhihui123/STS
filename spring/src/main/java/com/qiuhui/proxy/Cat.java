package com.qiuhui.proxy;

public class Cat implements Animal{

	public void bark() {
		
		
			System.out.println("Ã¨½Ð");
			throw new ClassCastException("ÊÇ²»ÊÇÉµ");
			
		
		/*System.out.println("Ã¨½Ð");*/
	}

	public int stop() {
		System.out.println("Ã¨Í£");
		return 10/0 ;
	}

}

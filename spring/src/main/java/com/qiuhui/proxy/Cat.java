package com.qiuhui.proxy;

public class Cat implements Animal{

	public void bark() {
		
		
			System.out.println("è��");
			throw new ClassCastException("�ǲ���ɵ");
			
		
		/*System.out.println("è��");*/
	}

	public int stop() {
		System.out.println("èͣ");
		return 10/0 ;
	}

}

package com.qiuhui.aop;

public class MyAdvice {

	
	public void beforeAdvice() {
		
		System.out.println("����ǰ��֪ͨ");
		
	}
	
	public void afterAdvice(int result) {
		System.out.println("����֪ͨ�ķ���ֵ��" + result);
		System.out.println("���Ǻ���֪ͨ");
	}
	
	public void exceptionAdvice(Exception e) {
		System.out.println("�����쳣֪ͨ"+ e.getMessage());
	}
	
	/*public void finallyAdvice() {
		System.out.println("��������֪ͨ");
	}*/
	
	public void aroundAdvice() {
		
		
	}
	
	
	
}

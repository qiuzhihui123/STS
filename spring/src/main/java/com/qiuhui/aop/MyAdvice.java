package com.qiuhui.aop;

public class MyAdvice {

	
	public void beforeAdvice() {
		
		System.out.println("我是前置通知");
		
	}
	
	public void afterAdvice(int result) {
		System.out.println("后置通知的返回值是" + result);
		System.out.println("我是后置通知");
	}
	
	public void exceptionAdvice(Exception e) {
		System.out.println("我是异常通知"+ e.getMessage());
	}
	
	/*public void finallyAdvice() {
		System.out.println("我是最终通知");
	}*/
	
	public void aroundAdvice() {
		
		
	}
	
	
	
}

package com.qiuhui.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {
	
	
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("哈哈，我是前置顾问");
		
	}
	
	public void afterReturningAdvice(JoinPoint joinPoint,Object result) {
		String method = joinPoint.getSignature().getName();
		System.out.println("哈哈，我是后置顾问,目标类的方法名是"+ method);
	}

	public void afterThrowingAdvice() {
		System.out.println("哈哈我是异常顾问");
	}
	
	public void afterAdvice() {
		System.out.println("哈哈，我是最终顾问");
		
	}
	
}

package com.qiuhui.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MyAdvice {
	
	
	public void beforeAdvice(JoinPoint joinPoint) {
		System.out.println("����������ǰ�ù���");
		
	}
	
	public void afterReturningAdvice(JoinPoint joinPoint,Object result) {
		String method = joinPoint.getSignature().getName();
		System.out.println("���������Ǻ��ù���,Ŀ����ķ�������"+ method);
	}

	public void afterThrowingAdvice() {
		System.out.println("���������쳣����");
	}
	
	public void afterAdvice() {
		System.out.println("�������������չ���");
		
	}
	
}

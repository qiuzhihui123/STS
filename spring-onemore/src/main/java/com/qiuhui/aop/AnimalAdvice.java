package com.qiuhui.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class AnimalAdvice {

	@Pointcut("execution(* com.qiuhui.proxy..Dog.*(..))")
	public void pointcut() {}
	
	
	@Before("pointcut()")
	public void before() {
		System.out.println("����ǰ��");
	}

	@AfterReturning("pointcut()")
	public void afterReturning() {
		System.out.println("���Ǻ��ù���");
		
	}
	
	@AfterThrowing("pointcut()")
	public void afterThrowing() {
		System.out.println("�����쳣����");
	}

	@After("pointcut()")
	public void after() {
		System.out.println("�������չ���");
	}
}

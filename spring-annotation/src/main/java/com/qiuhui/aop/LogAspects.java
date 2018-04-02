package com.qiuhui.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspects {

	/*@Pointcut("execution(* com.qiuhui.proxy.Sale.*(..))")
	public void pointcut() {
		
	}*/
	
	@Pointcut("execution(* com.qiuhui.proxy.SaleSon.*(..))")
	public void pointcut() {
		
	}
	
	
	@Before("pointcut()")
	public void beforeAdvice(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		
		System.out.println("����ǰ�ù��ʣ��ҵķ�������" + methodName );
	}
	
	@AfterReturning(value="pointcut()",returning="result")
	public void afterReturningAdvice(JoinPoint joinPoint,Object result) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("���Ǻ��ù���,�ҵķ�������"+methodName);
	}
	
	@AfterThrowing(value="pointcut()",throwing="e")
	public void afterThrowingAdvice(JoinPoint joinPoint,Exception e) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("�����쳣����,�ҵķ�������"+methodName);
	}
	
	@After("pointcut()")
	public void afterAdvice(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("�������չ��ʣ��ҵķ�������"+methodName);
	}
	
	
}

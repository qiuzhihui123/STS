package com.qiuhui.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;

public class ProxyTestCase {

	
	
	@Test
	public void bark(){
		
		final Dog dog = new Dog();
		
		//��ȡ�������
		ClassLoader classLoader = dog.getClass().getClassLoader();
		
		//��ȡĿ�����ʵ�ֵ����нӿڵ�Class����
		Class[] interfaces = dog.getClass().getInterfaces();
		
		//��������Ӧ�Ĵ������
		
		Animal animal = (Animal)Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {

			public Object invoke(Object proxy, Method method, Object[] arg2) throws Exception {
				
				System.out.println("���ӣ���");
				
				 Object obj = method.invoke(dog,arg2);
				System.out.println("����ͣ");
				return obj;
				
			}
			
		});
		
		animal.bark();
		
	}
	
}

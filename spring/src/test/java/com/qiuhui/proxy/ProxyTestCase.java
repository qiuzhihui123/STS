package com.qiuhui.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;

public class ProxyTestCase {

	
	
	@Test
	public void bark(){
		
		final Dog dog = new Dog();
		
		//获取类加载器
		ClassLoader classLoader = dog.getClass().getClassLoader();
		
		//获取目标对象实现的所有接口的Class数组
		Class[] interfaces = dog.getClass().getInterfaces();
		
		//创建出相应的代理对象
		
		Animal animal = (Animal)Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {

			public Object invoke(Object proxy, Method method, Object[] arg2) throws Exception {
				
				System.out.println("狗子，跑");
				
				 Object obj = method.invoke(dog,arg2);
				System.out.println("狗子停");
				return obj;
				
			}
			
		});
		
		animal.bark();
		
	}
	
}

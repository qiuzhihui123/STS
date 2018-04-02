package com.qiuhui.proxy;

import java.lang.reflect.Method;

import org.junit.Test;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class SaleProxyTestCase {

	@Test
	public void sale() {
		
		Enhancer enhancer = new Enhancer();
		
		enhancer.setSuperclass(Sale.class);
		
		enhancer.setCallback(new MethodInterceptor() {

			public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
				
				try {
				Object result = proxy.invokeSuper(obj, args);
				return result;
				} catch(Exception e) {
					e.printStackTrace();
					System.out.println("哈哈我异常了");
					return null;
				} finally {
					System.out.println("哈哈，怎样我都会执行");
				}
				
			}
			
			
		});
		
		Sale sale = (Sale)enhancer.create();
		sale.sale();
		
	}
	
}

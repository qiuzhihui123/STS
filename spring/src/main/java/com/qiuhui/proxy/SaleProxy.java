package com.qiuhui.proxy;

public class SaleProxy extends Sale{

	@Override
	public void sale() {
		System.out.println("售前");
		super.sale();
		System.out.println("售后");
	}
	
}

package com.qiuhui.proxy;

public class SaleProxy extends Sale{

	@Override
	public void sale() {
		System.out.println("��ǰ");
		super.sale();
		System.out.println("�ۺ�");
	}
	
}

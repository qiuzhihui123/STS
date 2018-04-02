package com.qiuhui.proxy;

import org.springframework.stereotype.Service;

import com.qiuhui.interfaces.SaleFather;

@Service
public class SaleSon implements SaleFather{

	@Override
	public void sale() {
		System.out.println("我是saleson，我卖掉了一件商品");
	}

}

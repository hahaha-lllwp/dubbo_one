package com.lwp.provider;

import com.lwp.api.DemoObject;
import com.lwp.api.DemoService;

public class DemoServiceImpl implements DemoService {
	public String printMessage(DemoObject demoObject) {
		System.out.println(demoObject.toString());
		return demoObject.toString();
	}
}

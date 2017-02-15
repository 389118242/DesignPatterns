package com.win.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class SubjectProxy implements InvocationHandler {
	
	private Object obj;
	
	public SubjectProxy(Object obj){
		this.obj = obj;
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("SubjectProxy invoke...");
		return method.invoke(obj, args);
	}

}

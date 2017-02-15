package com.win.test.proxy;

import java.lang.reflect.Proxy;

public class Run {

	public static void main(String[] args) {
		Subject sub = (Subject)Proxy.newProxyInstance(Run.class.getClassLoader(), SubjectImpl.class.getInterfaces(), new SubjectProxy(new SubjectImpl()));
		System.out.println(sub.add(2, 3));
	}

}

package com.win.test.proxy;

public class SubjectImpl implements Subject {

	public int add(int x, int y) {
		System.out.println("SubjectImpl add...");
		return x + y;
	}

}

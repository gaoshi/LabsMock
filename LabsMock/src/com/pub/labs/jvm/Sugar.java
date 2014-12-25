package com.pub.labs.jvm;


public class Sugar {

	public static void main(String[] args) {
		Integer a = 1;
		Integer b = 2;
		Long c = 3L;
		Integer d = 3;
		Integer e = 101;
		Integer f = 101;
		System.out.println(e==f);
		System.out.println(e.equals(f));
		System.out.println(c.equals(a+b));
		System.out.println(c==(a+b));
	}
}

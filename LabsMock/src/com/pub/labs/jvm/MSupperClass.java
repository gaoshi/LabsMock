package com.pub.labs.jvm;

public class MSupperClass {
	
	public static final String _CONST_STRING="Constant String";
	
	static {
		System.out.println("MSupperClass Init");
	}
	
	public static int val=10;
}

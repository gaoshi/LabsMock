package com.pub.labs.jvm;

/**
 * 
 * @author：Gaoshi
 * @remark：虚拟机启动,作为执行主类(包含main),虚拟机会初始化这个类
 */
public class Mock {
	public static void main(String[] args) {
		// System.out.println(MSubClass.val);
		// MSupperClass[] supper=new MSupperClass[10];
		System.out.println(MSupperClass._CONST_STRING);
	}
}

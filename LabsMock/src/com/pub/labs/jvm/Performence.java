package com.pub.labs.jvm;
/**
 * 
 * @author：Gaoshi
 * @remark：不要将try-catch语句置于循环体中，这样会降低性能，同时给系统带来极大的灾难
 */
public class Performence {

	public final static int execNums = 1000000;

	public static void main(String[] args) {
		inTryCatch();
		outTryCatch();
	}

	public static void inTryCatch() {
		int a = 0;
		long startTime = System.nanoTime();
		for (int i = 0; i < execNums; i++) {
			try {
				a++;
			} catch (Exception e) {
			}
		}
		long endTime = System.nanoTime();
		System.out.println("=====InTryCatch Cost Time======" + (endTime - startTime));
	}

	public static void outTryCatch() {
		int a = 0;
		long startTime = System.nanoTime();
		try {
			for (int i = 0; i < execNums; i++) {
				a++;
			}
		} catch (Exception e) {
		}
		long endTime = System.nanoTime();
		System.out.println("=====OutTryCatch Cost Time=====" + (endTime - startTime));
	}

}

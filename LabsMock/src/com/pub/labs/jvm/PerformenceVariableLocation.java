package com.pub.labs.jvm;

public class PerformenceVariableLocation {

	public final static int execNums = 1000000;
	public static int a = 0;

	public static void main(String[] args) {
		withVariable();
		withoutVariable();
	}

	public static void withVariable() {
		int ax = 0;
		long startTime = System.nanoTime();

		for (int i = 0; i < execNums; i++) {
			ax++;
		}
		long endTime = System.nanoTime();
		System.out.println("=====withVariable Cost Time=========" + (endTime - startTime));
	}

	public static void withoutVariable() {
		int ax = 0;
		long startTime = System.nanoTime();

		for (int i = 0; i < execNums; i++) {
			ax++;
		}
		a = ax;
		long endTime = System.nanoTime();
		System.out.println("=====withoutVariable Cost Time======" + (endTime - startTime));
	}

}

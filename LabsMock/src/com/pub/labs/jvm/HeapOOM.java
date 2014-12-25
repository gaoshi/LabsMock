package com.pub.labs.jvm;

import java.util.ArrayList;
import java.util.List;

public class HeapOOM {
	static class OOMObject {
	}
	
	public  void stackOverFlowErrorMock(){
		System.out.println("---");
		stackOverFlowErrorMock();
	}
	public static void main(String[] args) {
		List<HeapOOM.OOMObject> list = new ArrayList<HeapOOM.OOMObject>();
		while (true) {
			list.add(new OOMObject());
			
		}
	}
}

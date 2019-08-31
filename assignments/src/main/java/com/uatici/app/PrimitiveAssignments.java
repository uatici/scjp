package com.uatici.app;

public class PrimitiveAssignments {

	public static void main(String[] args) {
		
		byte a  = 3;
		byte b = 8;
		//showed at below line determinates any computing operation results integer type and jvm doesnt explicitly casting this result.
		//byte c = b + a;
		
		//this usage is proper
		byte c =  (byte) (b + a);
		System.out.println(c);
		
		//+= -= *= /= will all put in implicit cast.
		c +=7;
		System.out.println(c);
	}

}

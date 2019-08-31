package com.uatici.app;

public class InitializationBlock {
	
	InitializationBlock(int x) {
		System.out.println("1-arg const");
	}
	
	InitializationBlock(){
		System.out.println("no arg const");
	}
	
	static {
		System.out.println("1st static init");
	}
	
	{
		System.out.println("1st instance init");
	}
	
	{
		System.out.println("1st instance init");
	}
	
	static {
		System.out.println("2nd static init");
	}
	
	public static void main(String[] args) {
		new InitializationBlock();
		new InitializationBlock(7);
	}

}

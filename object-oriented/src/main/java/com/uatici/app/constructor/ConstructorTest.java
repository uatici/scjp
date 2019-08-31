package com.uatici.app.constructor;

public class ConstructorTest {
	public static void main(String[] args) {
//		new Animal("ufuk");
		Animal a = new Horse();
	}
}

class Animal {
	Animal (String name){
		System.out.println("from Animal with name");
	}
	
}

class Horse extends Animal {

	Horse(String name) {
		super(name);
		System.out.println("from Horse with name");
	}
	
	Horse(){
		this(new String());
		System.out.println("from Horse");
	}
	
}

package com.uatici.app.constructor;

public class ConstructorTest {

}

class Animal {
	Animal (String name){
		
	}
	
}

class Horse extends Animal {

	Horse(String name) {
		super(name);
	}
	
	Horse(){
		this(new String());
	}
	
}

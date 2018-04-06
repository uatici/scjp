package com.uatici.app.overriding_overloading;

public class TestAnimalsWithSuper {
	
	public static void main(String[] args) {
		Animals a = new Animals();
		Animals b = new Horses();
		a.eat();
		b.eat();
	}	
}

class Animals {
	public void eat() {
		System.out.println("Generic Animal Eating Generically");
	}
}

class Horses extends Animals {
	public void eat() {
		super.eat();
		System.out.println("Horse eating hay, oats, and horse treats");
	}
	
	public void buck() {
		
	}
}

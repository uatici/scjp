package com.uatici.app.overriding_overloading;

public class TestAnimals {
	
	public static void main(String[] args) {
		Animal a = new Animal();
		Animal b = new Horse();
		a.eat();
		b.eat();
	}	
}

class Animal {
	public void eat() {
		System.out.println("Generic Animal Eating Generically");
	}
}

class Horse extends Animal {
	public void eat() {
		System.out.println("Horse eating hay, oats, and horse treats");
	}
	
	public void buck() {
		
	}
}

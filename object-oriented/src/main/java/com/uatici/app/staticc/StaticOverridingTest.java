package com.uatici.app.staticc;

public class StaticOverridingTest {
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Animal [] animals = {new Animal() , new Dog() , new Animal()};
		for (Animal animal : animals) {
			animal.doStuff();
		}
	}
}

class Animal {
	static void doStuff() {
		System.out.println("a");
	}
}

class Dog extends Animal {
	static void doStuff() {
		System.out.println("b");
	}
}
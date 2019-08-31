package com.uatici.app.casting;

public class CastTest {
	
	public static void main(String[] args) {
		Animal [] a = {new Animal(), new Dog(), new Animal()};
		for(Animal animal: a) {
			animal.makeNoise();
			if(animal instanceof Dog) {
				((Dog) animal).playDead();
			}
		}
		
		//Upcasting calisir inheritance den dolayı
		Dog dog = new Dog();
		Animal a1 = dog; // upcast ok with no explicit cast
		Animal a2 = (Animal) dog; // upcast ok with an explicit cast
		
		//Another example this code compiles but fails later
		//Burada initialize edilen animal oldugu icin bu kod ilerde patlayacak.
		Animal animal = new Animal();
		Dog d = (Dog) animal;
		d.makeNoise();
		
		
		
	}

}

class Animal {
	void makeNoise() {
		System.out.println("Generic nouse");
	}
}

class Dog extends Animal {
	void makeNoise() {
		System.out.println("Bark");
	}
	
	void playDead() {
		System.out.println("Roll Over");
	}
}

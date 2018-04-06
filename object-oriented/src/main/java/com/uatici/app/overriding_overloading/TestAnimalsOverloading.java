package com.uatici.app.overriding_overloading;

public class TestAnimalsOverloading {
	
	public static void main(String[] args) {
		
		TestAnimalsOverloading testAnimalsOverloading = new TestAnimalsOverloading();
		
		
		AnimalO a = new AnimalO();
		HorseO b = new HorseO();
		AnimalO c = new HorseO();
		
		testAnimalsOverloading.doStuff(a);
		testAnimalsOverloading.doStuff(b);
		testAnimalsOverloading.doStuff(c);
		
	}
	
	public void doStuff(AnimalO a) {
		System.out.println("In the Animal version");
	}
	
	public void doStuff(HorseO a) {
		System.out.println("In the Horse version");
	}
}

class AnimalO {

}

class HorseO extends AnimalO {
}

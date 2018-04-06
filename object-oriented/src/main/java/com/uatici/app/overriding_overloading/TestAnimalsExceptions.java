package com.uatici.app.overriding_overloading;

public class TestAnimalsExceptions {
	
	public static void main(String[] args) {
		AnimalExceptions a = new AnimalExceptions();
		AnimalExceptions b = new HorseExceptions();
		//This happens even though, at runtime the eat() method used would be the Dog verion,which does not declare the exception
		try {
			a.eat();
			b.eat();
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
		}
	}	
}

class AnimalExceptions {
	public void eat() throws Exception{
		System.out.println("Generic Animal Eating Generically");
	}
}

class HorseExceptions extends AnimalExceptions {
	public void eat() {
		System.out.println("Horse eating hay, oats, and horse treats");
	}
	
	public void buck() {
		
	}
}

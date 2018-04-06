package com.uatici.app.returntype;

public class ReturnTypeTest {

	public static void main(String[] args) {
		ReturnTypeTest returnTypeTest = new ReturnTypeTest();
		System.out.println(returnTypeTest.foo());

	}
	//in a method with primitive return type, you can return any value or variable that can be implicitly converted to the declared return type.
	public int foo() {
		char c = 'c';
		return c;
	}
	
	//return type bir interface ise onu implemente eden class return degeri olarak verilebilir.
	
	public Chewable getChewable() {
		return new Gum();
	}

}
//Bu sublass bir metodu override ederken return type superclass da belirtilen metod return type ın subclass ı olabilir.
class Alpha {
	
	Alpha doStuff(char c) {
		return new Alpha();
	}
}

class Beta extends Alpha {
	Beta doStuff(char c) {
		return new Beta();
	}
}

//return type bir interface ise onu implemente eden class return degeri olarak verilebilir.

interface Chewable {}
class Gum implements Chewable{}



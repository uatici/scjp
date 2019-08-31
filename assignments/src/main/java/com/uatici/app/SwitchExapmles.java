package com.uatici.app;

public class SwitchExapmles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//caselerden birine girince eger break yoksa digerlerinede sırayla giriyor.
		//break yoksa illaki defaulta giriyor.
		int  x = 4;
		switch(x) {
		case 2:
		case 4: break;
		case 6:
		case 8:
		case 10: {
			System.out.println("x is an even number");
		}
		default: System.out.println("default");
		}

	}

}

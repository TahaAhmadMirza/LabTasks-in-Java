package com.main;

public class ExcepTest1 {

	public static void main(String[] args) {
		int d, a;
		try {

			d = 0;
			a = 42 / d;

			System.out.println(a);// will this statement execute ?
		}

		catch (ArithmeticException ex) {

			System.out.println("Divison by Zero Handled");
			a = 0; // set a to zero and continue
			

		}
	
		
		System.out.println(a);

	}

}

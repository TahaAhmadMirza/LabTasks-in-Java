package com.main;
/*
 * 1:Compile this program first simply with no args value
 *  you will get divide by zero exception
 * 
 * 2:Complile this program by assigning some value to args param in main method
 * Example is :
 * 
 *  javac Lab4\ExcepTest2.java
 *  java Lab4.ExcepTest2 hello
 *
 *  you will get Array index out of bound exception
 *  
 *  * */
public class ExcepTest2 {

	public static void main(String[] args) {

		try {
			

			int b = 42 / 7;

			int c[] = { 1 };

			c[42] = 9;
		}
		 catch (ArithmeticException e) {
			
			System.out.println("Divide by zero..."+e);
			
		} catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println("Array index out of bound "+ex);
			
		}

	}

}

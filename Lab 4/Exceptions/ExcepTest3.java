package com.main;

public class ExcepTest3 {

	public static void main(String[] args) {
		try {
			int a = 0;

			int b = 10 / a;
		}
		 catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("In first catch");
			e.printStackTrace();
		}
		/* This catch Block is never reached why ??
		catch(ArithmeticException ex)
		{
			System.out.println("I am here");
			
		}*/

	}

}

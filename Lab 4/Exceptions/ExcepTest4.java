package com.main;

public class ExcepTest4 {
	static void demo() {
		try {
			//two ways of throw
			//1: with new operator
			//2: throw ex
			
			
			throw new NullPointerException("Message from Demo");// creates a new Instance with a param value
						
		} catch (Exception ex) {
			
			System.out.println("Caught inside demo function ");

			throw ex;// ReThrow the exception
		}
	}

	public static void main(String[] args) {
		try {
			
			demo();
			
		} 
		catch (NullPointerException e)
		
		{
			System.out.println("Recaught in main:  " + e.getMessage());
		}
	}

}

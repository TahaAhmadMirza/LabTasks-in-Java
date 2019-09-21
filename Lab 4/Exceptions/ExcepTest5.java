package com.main;

public class ExcepTest5 {

	static void demo() throws IllegalAccessException {
		System.out.println("Inside Demo Method");

		throw new IllegalAccessException("Message from Demo");

	}

	public static void main(String[] args) {
		try {
			demo();
		} catch (NullPointerException e) {
			
		System.out.println("Caught in NullPointer Block :->"+ e);
		} catch (Exception e) {
			
			System.out.println("Caught in Exception Block  :->"+ e);
		}

	}

}

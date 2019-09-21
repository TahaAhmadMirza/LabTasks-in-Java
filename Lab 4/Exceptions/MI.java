package com.main;
import java.io.*;
public class MI {

	public static void main(String[] args) {
		System.out.println("Enter Your Name");
		InputStreamReader Ir=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(Ir);
		try {
			String Name=br.readLine();
			System.out.println("Hello "+Name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}



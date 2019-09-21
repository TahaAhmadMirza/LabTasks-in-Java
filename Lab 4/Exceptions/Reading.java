package com.main;
import java.io.*;
//https://docs.oracle.com/javase/7/docs/api/java/io/package-summary.html
public class Reading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("C:/Users/Mian Usman/AP/Lab 3/src/com/main/Infile.txt");
		BufferedReader br=new BufferedReader(new FileReader(f));
		String F_Line=br.readLine();
		System.out.println(F_Line);
		//File Writing
		File f2=new File("C:/Users/Mian Usman/AP/Lab 3/src/com/main/Outfile.txt");
		//BufferedWriter bw=new BufferedWriter(new FileWriter(f2));
		PrintWriter pw=new PrintWriter(new FileWriter(f2));
		F_Line="Writing to file "+F_Line;
		pw.println(F_Line);
		br.close();
		pw.close();

	}

}


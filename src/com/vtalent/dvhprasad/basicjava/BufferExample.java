package com.vtalent.dvhprasad.basicjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferExample {


public static void main(String[] args) throws IOException {
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter your name");
	String s=br.readLine();
	System.out.println("Enter your salary");
	//String s1=br.readLine();
	int i=Integer.parseInt(br.readLine());//we may use s1 instead of br.readLine 
	System.out.println("Your details are="+s+" "+i);
	br.close();
}
}



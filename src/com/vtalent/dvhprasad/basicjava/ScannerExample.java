package com.vtalent.dvhprasad.basicjava;

import java.util.Scanner;

public class ScannerExample {
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your name");
	String s=sc.next();
	System.out.println("Enter your salary");
	int i=sc.nextInt();
	System.out.println("Your details are ="+s+" "+i);
	sc.close();
}
}

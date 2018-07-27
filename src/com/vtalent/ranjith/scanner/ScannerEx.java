package com.vtalent.ranjith.scanner;

import java.util.Scanner;

public class ScannerEx {
	 public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        System.out.println("enter a integer");
	        int i = scan.nextInt();
	        System.out.println("enter a double");
	        double d=scan.nextDouble();
	        System.out.println("enter a String");
	        scan.nextLine();
	        String s=scan.nextLine();
	        

	        System.out.println("String: " + s);
	        System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	        scan.close();
	    }

}

package com.vtalent.nagaraju.basics;

import java.util.Scanner;

public class ReadingInputsUsingScannerFromCMD {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the name");
		String name=scanner.nextLine();
		System.out.println("enter the salary");
		//int sal=Integer.parseInt(scanner.next());
		int sal=scanner.nextInt();
		System.out.println("entrered name---"+name+"--entered salary---"+sal);
		scanner.close();
	}

}

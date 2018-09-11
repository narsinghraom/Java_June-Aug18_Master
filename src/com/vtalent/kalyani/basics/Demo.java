package com.vtalent.kalyani.basics;

import java.io.IOException;
import java.util.Scanner;


public class Demo {

	public static void main(String[] args) throws IOException {
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in); 
		System.out.println("enter yoyr name");
		//String s=br.readLine();
		String s=sc.next();
		System.out.println("enter your sal");
		//String s1=br.readLine();
		//int i=Integer.parseInt(s1);
		int i=sc.nextInt();
		System.out.println("your details are"+s+i);
		
		sc.close();
		
	}

}

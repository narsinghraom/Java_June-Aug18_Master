package com.vtalent.nagaraju.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;


public class ReadingFromCMD  {

	public static void main(String[] args) throws IOException {
		//BufferedReader bufferReader=new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the name");
		String x=scanner.next();
//		String name=bufferReader.readLine();
//		System.out.println("enter the salary");
//		int sal=Integer.parseInt(bufferReader.readLine());
//	System.out.println("entered name---"+name+"---entered salary---"+sal);
		System.out.println("enter");
        scanner.close();
       
	}

}

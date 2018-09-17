package com.vtalent.nagaraju.basics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingFromCMD {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferReader=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the name");
		String name=bufferReader.readLine();
		System.out.println("enter the salary");
		int sal=Integer.parseInt(bufferReader.readLine());
		System.out.println("entered name---"+name+"---entered salary---"+sal);
        bufferReader.close();
	}

}

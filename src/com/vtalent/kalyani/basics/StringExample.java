package com.vtalent.kalyani.basics;

public class StringExample {

	public static void main(String[] args) {
		String s="hello";
		String s1="hai";
		String s2="Hello";
		//charAt();
		char ch=s.charAt(2);
		System.out.println(ch);
		
		//equals and equalsIgnoreCase(); 
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s1));
		System.out.println(s.equalsIgnoreCase(s2));
		
		//compareto();
		
		int v=s.compareTo(s1);
		int t=s.compareTo(s2);
		int b=s.compareTo("hello");
		
		System.out.println(v);
		System.out.println(t);
		System.out.println(b);
		
		//concat();
		String s3=s.concat("how r u");
		System.out.println(s3);
		
		//substring();
		s3=s.substring(2);
		System.out.println(s3);
			

}

	}



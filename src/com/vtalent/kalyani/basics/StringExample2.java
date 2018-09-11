package com.vtalent.kalyani.basics;

public class StringExample2 {

	public static void main(String[] args) {
		String str= new String("my welcome name is kalyani");
		String str2="  welcome";
		
		//startswith();
		System.out.println(str.startsWith("my"));
		System.out.println(str.startsWith("name", 3));
		
		//endswith();
		System.out.println("ends wuth" +str.endsWith("name"));
		
		//equals();
		System.out.println(str.equals(str2));
		System.out.println(str2.equals("welcome"));
		
		//format();
	//	String format=String.format("my string is %s ", str);
		
		//indexof();
		System.out.println(str.indexOf('w'));
		System.out.println(str.indexOf('a', 10));
		
		//lastindexof()
		System.out.println(str.lastIndexOf("is"));
		System.out.println(str.lastIndexOf(str2));
		
		//length();
		System.out.println(str.length());
		System.out.println(str2.length());
		
		//replace();
		System.out.println(str.replace('e', 'a')); 
		System.out.println(str.replace("is", "us"));
		
		//trim();
		System.out.println(str2.trim());
		
		//hashcode();
		
	System.out.println(str2.hashCode());
	}

}


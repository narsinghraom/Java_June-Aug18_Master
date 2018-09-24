package com.vtalent.ashwini.basicjava;

public class HeapEx {

	public static void main(String[] args)
	{
		String s=new String("ashwini");
		String s1=s.concat("reddy");
		s=s1;
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
	
		
		String s3=s.toLowerCase();
		System.out.println(s==s3);
		System.out.println(s.equals(s3));
		
		
		String s4=s.toUpperCase();
		System.out.println(s==s4);
		System.out.println(s.equals(s4));
		System.out.println(s.equalsIgnoreCase(s4));

	}

}

package com.vtalent.ashwini.basicjava;

public class InternEx {

	public static void main(String[] args) 
	{
		String s=new String("ashwini");
		String s1=s.intern();
		System.out.println(s==s1);
		
		
		String s2="ashwini";
		System.out.println(s1==s2);
		
		
		String s3=s.concat("reddy");
		String s4=s3.intern();
		System.out.println(s3==s4);
		
		String s5="ashwinireddy";
		System.out.println("this is intern"+" "+(s3==s5));
		
		

	}

}

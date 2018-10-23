package com.vtalent.ashwini.basicjava;

public class HeapScpEx {

	public static void main(String[] args) 
	{
		//this is for scp
		String s="ashwini";
		String s1=s.toLowerCase();
		System.out.println(s==s1);
		
		
		String s2=s.toUpperCase();//this object gets created in heapmemory
		System.out.println(s==s2);
		
		String s3="ASHWINI";
		System.out.println(s2==s3);//this is the proof.........
		
		//this is for heapmemory
		
		String s4=new String("ashwini");
		String s5=s4.toLowerCase();
		System.out.println("for heap memory"+" "+(s4==s5));
		
		String s6=s4+"reddy";
		System.out.println(s6);
		String s11="ashwinireddy";
		System.out.println(".........."+(s6==s11));
		
		String s7=new String("ashwinireddy");
		System.out.println(s6==s7);
		
		String s9=s6.toLowerCase();
		System.out.println("this....."+(s9==s6));
		
		String s8=s7.toString();
		System.out.println(s7==s8);
		
		}
}
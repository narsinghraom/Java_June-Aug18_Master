package com.vtalent.dvhprasad.basicjava;

public class StringExample {
	public static void main(String[] args) {
		String s="PRASAD";
		String s1="prasad";
		String s2="manikanth";
		String s3=new String("prasad");
		String s4=new String("PRAsad");
		System.out.println(s.equals(s1));
		System.out.println(s1.equals(s));
		System.out.println(s.equalsIgnoreCase(s4));
		System.out.println(s2.equals(s3));
		
		char ch=s.charAt(5);
		System.out.println(ch);
		
		String s5=s.concat("DVH");
		System.out.println(s5);
		
		s4=s.substring(3);
		System.out.println(s4);
		
		s4=s.substring(3,5);
		System.out.println(s4);
		
		System.out.println(s.length());
		
		System.out.println(s.toLowerCase());
		
		System.out.println(s3.toUpperCase());
		
		
		System.out.println(s.hashCode());
		
		System.out.println(s.indexOf(4));
		
		System.out.println(s.contentEquals(s1));
		
		System.out.println(s1.compareTo(s3));
		
		System.out.println(s.replace('A','E'));
		
		s5="my name is dvh prasad dvh";
		
		System.out.println(s5.replaceFirst("my","His"));
		
		System.out.println(s5.replaceAll("dvh","Dasari"));
		
		System.out.println(s5.contains(s1));
		
		//System.out.println(s.compareTo(s1)); y code
		
		int i=10;
		
		System.out.println(s1.valueOf(i));
		
		

	
	
	
	
	
	}
}

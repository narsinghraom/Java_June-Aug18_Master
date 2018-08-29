package com.vtalent.sahithi;

public class StrToChar {
	public static void main(String[] args) {
		String s="sahithi vtalent";
//		System.out.println(s.length());
		char[] ch=s.toCharArray();//STRING into CHAR
		System.out.println(ch.length);
		
		char ch1=s.charAt(3);
		System.out.println(ch1);
		
		char[] ch2=new char[15];
		s.getChars(1, 15, ch2, 0);//s.getChars(3, 8, ch2, 2)
		System.out.println(ch2);
		
		
	}

}

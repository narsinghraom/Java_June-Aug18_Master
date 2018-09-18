package com.vtalent.nagaraju.basics;

public class Test {
	public static void main(String[] args) {
		String s1="abc";
		String s2=new String(s1);
		s1=s2;
		if(s1==s2){
			System.out.println("true");
		}
	}

}

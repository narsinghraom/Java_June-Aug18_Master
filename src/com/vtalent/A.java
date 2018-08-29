package com.vtalent;

public class A {
	
	A(){
		System.out.println("1");
	}
	static{		
		System.out.println("3");
	}

	public static void main(String[] args) {
		
		A a=new A();
		A a1=new A();
		System.out.println("2");
	}

}

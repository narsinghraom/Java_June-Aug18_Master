package com.vtalent.kalyani.basics;

public class Test1 {

	public static void main(String[] args) {
		First f=new First();
		f.function(2);
		System.out.println(f.i);
		System.out.println(f.j);
		
		second s=new second();
		s.function(2);
		s.function(2, 3);
		System.out.println(s.i);
		System.out.println(s.j);
		

	}

}

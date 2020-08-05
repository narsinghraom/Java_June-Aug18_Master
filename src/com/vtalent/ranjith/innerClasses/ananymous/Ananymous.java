package com.vtalent.ranjith.innerClasses.ananymous;

public class Ananymous {
public static void main(String[] args) {
	Example e=new Example(){	
		public void function1(int i) {
			System.out.println(i);			
		}
	
		public void function2(int k) {
			System.out.println(k);
		}	
		
	};
	e.function1(5);
	e.function2(10);
}
}


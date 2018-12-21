package com.vtalent.kalyani.basics;

public class Test2 {

	public static void main(String[] args) 
	{
		second1 s=new second1();
		s.function(2);
		s.function(10, 20);
				
	   // s= new First1();
		s.function(2);
		/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
					Type mismatch: cannot convert from First to second1

					at com.vtalent.kalyani.basics.Test2.main(Test2.java:11)*/

				
				
		s=new Third1();
		 s.function(2);
		 s.function(10, 20);
		

	}

}

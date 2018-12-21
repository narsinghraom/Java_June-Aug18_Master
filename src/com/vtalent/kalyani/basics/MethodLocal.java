package com.vtalent.kalyani.basics;

public class MethodLocal {
	public static void m1()
	{
		class Inner{
			public void sum(int x, int y)
			{
				System.out.println(x+y);
			}
			
		}
		Inner i=new Inner();
		i.sum(10,100);
		i.sum(20,300);
		
	}
	

	public static void main(String[] args) {
		 MethodLocal m=new  MethodLocal();
		 m.m1();
		
	

	}

}

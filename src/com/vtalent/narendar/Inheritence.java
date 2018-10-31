package com.vtalent.narendar;

class First 
{
	int i,j;
	public void function(int i)
	{
		this.i=this.i+i;
		j=i*i;
	}
}
 class Second extends First
 {
	 int i;
	 public void function(int i, int j)
	 {
		 this.i=i+j;
		 this.j=i+j+this.j;
	 }
 }


public class Inheritence {

	public static void main(String[] args)

	{
		First f=new First();
		f.function(2);
		System.out.println(f.i);
		System.out.println(f.j);
		
		Second s=new Second();
		s.function(3);
		s.function(f.i, f.j);
		System.out.println(s.i);
		System.out.println(s.j);
		
		
		
	}
}

package com.vtalent.ashwini.basicjava;


 class First 
{
	int i,j;
	public void function(int i)
	{
		this.i=i+i;
		j=i;
		System.out.println("this is i value from first class"+" "+i);
		System.out.println("this is j value from first class"+" "+j);
	}

}
 class Second extends First
 {
 	int j,i;
 	public void function(int i,int j)
 	{
 		this.j=j+i;
 		super.i=super.i+i;
 		System.out.println("i value from second class"+" "+i);
 		System.out.println("j value from second class"+" "+j);
 				
 	}

 }
 class Third extends Second
 {
 	int i,j;
 	public void function(int i,int j)
 	{
 		this.i=i+j;
 		super.i=super.i+this.i;
 		System.out.println("i value from third class"+" "+i);
 		System.out.println("j value from third class"+" "+j);
 	}

 }

public class Test1
{
	public static void main(String[] args)
	{
		First f=new First();
		f.function(10);
		//f.function(10,20);trying to call second class function(int i,int j) method using parent object
		/*error:Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			The method function(int) in the type First is not applicable for the arguments (int, int)*/
		f=new Second();
		f.function(10);
		//f.function(10,20);
		f=new Third();
		//f.function(10,20);
		Second s=new Second();
		s.function(20);
		s.function(10,20);
		//s=new First();
		/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			Type mismatch: cannot convert from First to Second*/
		s=new Third();
		s.function(30,40);
		Third t=new Third();
		t.function(50);
		t.function(60,70);
		//t=new first();
		/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			first cannot be resolved to a type*/
		//t=new second();
			

	}

}

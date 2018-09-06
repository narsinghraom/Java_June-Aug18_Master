package com.vtalent.kalyani.basics;

 class First1 {
	int i, j;
	public void function(int i)
	{
		this.i=i+i;
		j=i;
		System.out.println("first class i value"+this.i);
		System.out.println("first class j value"+j);
	}
}
class second1 extends First1
{
	int i,j;
	public void function(int i, int j)
	{
		this.j=j+i;
		super.i=super.i+i;
		System.out.println("value of this.j in second class"+this.j);
		System.out.println("value of super.i in second class"+super.i);
	}
}
class Third1 extends second1
{
	int i, j;
	public void function(int i, int j)
	{
		this.i=i+j;
		super.i=super.i+this.i;
		System.out.println(" value of this.i in third class"+this.i);
		System.out.println("value of super.i in third class"+super.i);
	}
	
	
}
public class Test1 {

	public static void main(String[] args) {
		First1 f=new First1();
		f.function(2);
		
	     f=new second1();
		f.function(2);
		/*Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
			Type mismatch: cannot convert from First1 to Third1

			at com.vtalent.kalyani.basics.Test1.main(Test1.java:64)*/

		
		f=new Third1();
		f.function(2);
		/*exception in thread "main" java.lang.Error: Unresolved compilation problems: 
			Type mismatch: cannot convert from Third1 to First
			Type mismatch: cannot convert from First1 to Third1

			at com.vtalent.kalyani.basics.Test1.main(Test1.java:51)*/
		
	
	}

}

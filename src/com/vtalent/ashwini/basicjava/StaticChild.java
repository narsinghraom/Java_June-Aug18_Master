package com.vtalent.ashwini.basicjava;


 class StaticParent 
{
	 private void Sum()
	 {
		 System.out.println("this is private sum");
	 }
	public static void main(String[] args)
	{
	System.out.println("this is saticparent");

	}

}
public class StaticChild extends StaticParent
{
	private void sum()
	{
		System.out.println("this private sum in child ");
	}
	public static void main(String[] args) 
	{
		StaticChild s=new StaticChild();
		//s.sum();
		StaticParent p=new StaticParent();
		p.sum();
		
	}
}


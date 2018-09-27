package com.vtalent.ashwini.basicjava;


 class StaticParent 
{
	 protected void Sum()
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
<<<<<<< HEAD
		s.sum();
			
=======
		p.Sum();
		
>>>>>>> 674c85bdb2c70ce62a451199758ae36a82d072b5
	}
}


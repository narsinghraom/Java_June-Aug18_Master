package com.vtalent.sowmya;

abstract class Abstraction {
	abstract  void show();
	public void print()
	{
		System.out.println("My methos is print");
	}
}
	 class Demo1 extends Abstraction
	{
		public void show()
			System.out.println("Are Yiu going anywere");
		}
		public  void  service()
		{
			
		System.out.println("Helloo everone");	
		}
	

	 public static void main(String[] args) 
	 {
		 Demo1 de=new Demo1();
		 de.show();
		 de.print();
		 de.service();
		 
		
	}

}


package com.vtalent.sreenivasa;

public class StaticOuterExample 
{
	//instance member
	private int outer_x=25;
	//static member
	static float outer_y=2.5f;
	//private member
	private static int outer_private=30;
	 static class InnerExample
	{
		void display()
		{
			StaticOuterExample se=new StaticOuterExample();
			System.out.println("outer_y="+outer_y);
			System.out.println("outer_x="+se.outer_x);
			System.out.println("the outer priver is="+outer_private);
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//with static class object creation
		//StaticOuterExample s=new StaticOuterExample();
		StaticOuterExample.InnerExample outer=new StaticOuterExample. InnerExample();
		outer.display();
		
		//directly we can create
		//StaticOuterExample.InnerExample.display();
		
		
		//without static class object creation
		/*StaticOuterExample s=new StaticOuterExample();
		StaticOuterExample.InnerExample s1=s.new InnerExample();
		s1.display();*/

	}

}

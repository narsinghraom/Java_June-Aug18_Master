package com.vtalent.sreenivasa;

public class OuterClass
{
	private int i=20;
	public void disp(int i)
	{
		System.out.println(this.i+i);
	}
	static class StaticInnerClass
	{
		float f1=2.5f;
		public static void disp(float f1)
		{
			OuterClass o=new OuterClass();
			o.disp((int)f1);
			System.out.println(f1+f1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*OuterClass.StaticInnerClass outer=new OuterClass.StaticInnerClass();
		outer.disp(3.5f);*/
		
		//we can create directly
		OuterClass.StaticInnerClass.disp(4.5f);

	}

}

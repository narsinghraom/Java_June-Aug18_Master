package com.vtalent.sreenivasa;

public abstract class AnonymousExample 
{
	abstract void disp(int i);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnonymousExample ae=new AnonymousExample()
		{
			public void disp(int i)
			{
				System.out.println(i);
			}
		};
		ae.disp(30);
	}

}

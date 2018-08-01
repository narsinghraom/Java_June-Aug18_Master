package com.vtalent.ranjith.scanner;

public abstract class AnonymousExample
{
	public abstract void disp(int i);
	{}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnonymousExample an=new AnonymousExample()
		{
			public void disp(int i)
			{
				System.out.println(i);
			}
		};
		an.disp(10);

	}

	}

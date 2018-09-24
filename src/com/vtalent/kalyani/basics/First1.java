package com.vtalent.kalyani.basics;


	public class First2 {
		public int i;
		int j;
		static int k;
		public void function(int i)
		{
			this.i=i+i;
			j=i;
		}
	}
	class second2 extends First1
	{

		int i,j;
		public void function(int i, int j)
		{
			this.j=j+i;
			super.i=super.i+i;
		}
	}
	class Third3 extends second2
	{
		int i, j;
		public void function(int i, int j)
		{
			this.i=i+j;
			super.i=super.i+this.i;
		}
	}





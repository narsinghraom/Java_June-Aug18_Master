package com.vtalent.sreenivasa;


public class Sample 
{
	interface it1
	{
	}
	int i,j;//6,12,20,100
	Sample()
	{
		i=5;
		j=7;
	}
	Sample(int i)
	{
		this(3,4);
		this.i=i+i;
		j=i*i;
	}
	Sample(int i,int j)
	{
		
		this.i=i+i;
		this.j=i*j;
		
	}
	public void function()
	{
		System.out.println(i);
		System.out.println(j);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sample s=new Sample(10);
s.function();
//Sample s1=new Sample(2);
//s1.function();
/*Sample s2=new Sample();
s2.function();*/
	}

}

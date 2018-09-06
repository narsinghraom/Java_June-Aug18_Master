package com.vtalent.kalyani.basics;

public class First {
	public int i;
	int j;
	public void function(int i)
	{
		this.i=i+i;
		j=i;
	}
}
class second extends First
{
	int i,j;
	public void function(int i, int j)
	{
		this.j=j+i;
		super.i=super.i+i;
	}
}
class Third extends second
{
	int i, j;
	public void function(int i, int j)
	{
		this.i=i+j;
		super.i=super.i+this.i;
	}
	
	
}
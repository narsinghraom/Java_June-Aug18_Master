package com.vtalent.kalyani.basics;

public class First {
	int i, j;
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
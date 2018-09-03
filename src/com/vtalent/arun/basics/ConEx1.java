package com.vtalent.arun.basics;

public class ConEx1 {
int i,j;
ConEx1()  {
	this(2,3);
	i=5;j=10;
}
ConEx1(int i)
{
	this.i=this.i+i;
	j=j+i;
}
ConEx1(int i,int j)
{
	this(i+j);
	this.i=this.i+i;
	this.j=this.j+j;
}
    public static void main(String[] args) {
	ConEx1 ce=new ConEx1();
	System.out.println(ce.i);
	System.out.println(ce.j);

	}

}

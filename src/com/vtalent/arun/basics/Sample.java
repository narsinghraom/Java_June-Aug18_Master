package com.vtalent.arun.basics;
/**
 * 
 * @author lenovo
 *
 */
public class Sample {
	static long l1,l2;
	double d1,d2;
	int a,b;
	public double functionOne(double d1,double d2)
	{
		this.d1=a+d2;
		this.d2=this.d1+b;
		return d1+d2;
	}
	public void fucntion(int a,int b){
		
	}
public static Sample functionTwo(long l1)
{
	Sample s1=new Sample();
	s1.l1=l1;
	s1.l2=(long)s1.functionOne((double)l1,(double)l2);
	return s1;
			
}
public void sum()
{
	System.out.println("hi...........");
}
public static void main(String[] args) {
	Sample s1=functionTwo(5);
	System.out.println(s1.d1);
	System.out.println(s1.d2);
	System.out.println(l1);
	System.out.println(l2);
	System.out.println(s1);
	
}
}

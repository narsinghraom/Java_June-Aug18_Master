package com.vtalent.ashwini.basicjava;
/**
 * 
 * @author welcome
 *
 */
public class Sample
{
	static long l1,l2;
	double d1,d2;
	public double functionOne(double d1,double d2)
	{
		this.d1=d1+d2;
		this.d2=this.d1+d2;
		return d1+d2; 
	}
	public static Sample functionTwo(long l1,long l2)
	{
		Sample s1=new Sample();
		s1.l1=l1;
		s1.l2=(long)s1.functionOne((double)l1,(double)l2);
				return s1;
	}
	public static void main(String[] args) {
		System.out.println();
	}
	
}

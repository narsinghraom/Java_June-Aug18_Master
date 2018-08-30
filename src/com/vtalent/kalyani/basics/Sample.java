package com.vtalent.kalyani.basics;


/**
 * 
 * @author Ram
 *
 */
public class Sample {

	static long l1,l2;
	double d1,d2;
	public double functionOne(double d1, double d2)
	{
	this.d1=d1+	d2;
	this.d2=d1+d2;
	return d1+d2;
		
	}
	public static Sample functionTwo(long l1)
	{
		Sample t=new Sample();
		t.l1=l1;
		t.l2=(long)t.functionOne((double)l1, (double)l2);
		return t;
	
	}

	public static void main(String[] args) {
		Sample t= functionTwo(5);
		System.out.println(t.d1);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(t);
		

	}

}
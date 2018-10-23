package com.vtalent.ashwini.basicjava;

public class Xyz 
{
	
	public static void main(String[] args) 
	{
		int i1=args.length;
		System.out.println(i1);
		Integer intobj=Integer.valueOf(i1);
		int i=intobj.intValue();
		if(args.length>1)
			System.out.println(i);
		if(args.length>0)
			System.out.println(i-1);
		else
			System.out.println(i-2);
	}

	
}

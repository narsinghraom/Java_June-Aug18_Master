package com.vtalent.kalyani.basics;

public class Array
{
	int[] i=new int[3];
	float[] f;
	public float[] function(int[]i)
	{
<<<<<<< HEAD
=======
		f=new float[i.length];
		for(int k=0;k<=i.length-1;k++)
>>>>>>> bb7c5a05b70bb94e9cfc05133d7c3409a810af43
		{
			f[k]=i[k];
		}
		return f;
	}
	

	public static void main(String[] args) 
	{
Array ae=new Array();
for(int k=0;k<=ae.i.length-1;k++)
{
	ae.i[k]=k+5;
	//System.out.println(ae.i);
	
}
float[] f=ae.function(ae.i);
for(int m=0;m<=f.length-1;m++)
{
	System.out.println(f[m]);
}
System.out.println(f);
System.out.println(ae.i);
	}

}

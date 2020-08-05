package com.vtalent.narendar;

public class JavaVariablesExample1 {

	static int i,j;
	float f1;
	static float f2;
	public void functionOne()
	{
		f1=1.5f;
		f2=1.5f;
	}
	public static float functionTwo(int i,int j)
	{
		JavaVariablesExample1.i=i+j;
		JavaVariablesExample1.j=i*j;
		return (float)JavaVariablesExample1.i;
	}
	
	public int functionThree(float f1,float f2)
	{
		this.f1=f1+this.f1;
		this.f2=f2+this.f2;
		return (int)this.f1;
	}
	public static void main(String[] args)
	{
		JavaVariablesExample1 jv1=new JavaVariablesExample1();
		jv1.functionOne();
		float f1=functionTwo((int)jv1.f1,(int)jv1.f2);
		int k=jv1.functionThree(f1,f2);
		System.out.println(jv1);
		System.out.println(k);
		System.out.println(f1);
		System.out.println(jv1.f1);
		System.out.println(i);
		System.out.println(JavaVariablesExample1.j);//directly also we can call  becoz static members directly we can call into another static members.
		
		
	}
}

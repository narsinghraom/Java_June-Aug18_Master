package com.vtalent.jyothsna;
interface Xyz
{
	void function(int i, int j);
	void function(float f);
	}
class Implementation implements Abc,Xyz {
public void function(int i)
{
		i=(int)pi+i;
		System.out.println(i);
	}
	public void function(float f) 
	{
		f=pi+f;
		System.out.println(f);
	}
	public void function(int i,int j) 
	{
		i=i+j;
		j=i*j;
		System.out.println(i+j);
	}
}
interface Mnr{
	void function(int i, int j);
	void function(long l, float f);
}
class Implementation1 extends Implementation implements Mnr
{
public void function(long l,float f)
{
System.out.println(l+(long)f);	
}
}
class Implementation2 implements Mnr
{
public void function(int i,int j) {
	System.out.println(i+i);
	}
public void function(long l, float f) {
	System.out.println(l+f);
}
}
class TestInheritance{
	public static void main(String[] args) {
		Abc abc=new Implementation();
		abc.function(2);
		abc.function(2.5f);
		//abc.function(2,3);
		System.out.println("===============");
		Xyz xyz=new Implementation();
		xyz.function(2);
		xyz.function(2.5f);
		xyz.function(2,3);
		System.out.println("===============");
		Mnr mnr=new Implementation1();
		Xyz xyz1=new Implementation1();
		Abc abc1=new Implementation1();
		//mnr.function(2);
		//mnr.function(2.5f);
		mnr.function(3,4);
		mnr.function(20,2.5f);
		System.out.println("==================");
		Mnr mnr1=new Implementation2();
		//mnr.function(2);
		//mnr.function(2.5f);
		mnr1.function(1,2);
		mnr1.function(10,2.2f);
		
		
		

	}
	
}

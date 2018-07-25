package com.vtalent.jyothsna;
class AbcImpl implements Abc{
public void function(int i)
	{
	//k=i+i
	i=k+i;
	System.out.println(i);
	System.out.println(k);
	}
public void function(float f)
{
f=pi+f;
System.out.println(f);
System.out.println(pi);
}
}
public class AbcTest {
	
	public static void main(String args[])
	{
		AbcImpl a1=new AbcImpl();
		a1.function(2);
		a1.function(2.5f);
		
		
	}

}

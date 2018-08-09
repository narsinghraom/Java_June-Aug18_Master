package com.vtalent.karunya;

import java.io.IOException;

public class A {
	void add() throws Exception
	{
		concat();
	}
	void concat() throws IOException
	{
		throw new IOException("my IOException");
	}
}
class Demo{
	public static void main(String[] args)throws Throwable
	{
		A a=new A();
		a.add();
	}
}

package com.vtalent.sreenivasa;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public  class MySystem
{
	private MySystem()
	{
		
	}
	//static MyPrintStream 
	static MyPrintStream out=new MyPrintStream(new MyOutputStream()
	{
		public void console()
		{
			System.out.println();
		}
		
	});
	
}

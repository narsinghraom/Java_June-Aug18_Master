package com.vtalent.saikrishna.system;

public final class MySystem 
{
	
	private MySystem() 
	{
		//static PrintStream out;	
	}
	//static PrintStream out;
		 static MyPrintStream out=new MyPrintStream(new MyOutputStream()
				{
			public void console()
			{
			
			}
				});
}

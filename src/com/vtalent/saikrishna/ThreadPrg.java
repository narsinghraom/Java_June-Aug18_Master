package com.vtalent.saikrishna;

public class ThreadPrg extends Thread
{
	public synchronized void f1(int i)
	{
		System.out.println(i);
	}
	public void run()
	{
		for(int i=0;i<=10;i++)
		{
		
			System.out.println(i);
			
		}
	}
	public static void main(String[] args) 
	{
		ThreadPrg t1=new ThreadPrg();
		t1.start();
		
		/*ThreadPrg t2=new ThreadPrg();
		t2.start();*/
	}
}

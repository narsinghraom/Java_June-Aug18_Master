package com.vtalent.sreenivasa;

public class SynchronizedExample extends Thread
{
	public synchronized void function(int i)
	{
		System.out.println(i);
	}
	public void run()
	{
		for(int i=0;i<=3;i++)
		{
			function(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SynchronizedExample se=new SynchronizedExample();
		se.start();
		SynchronizedExample se1=new SynchronizedExample();
		se1.start();


	}

}

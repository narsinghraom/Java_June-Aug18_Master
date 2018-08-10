package com.vtalent.narendar;

//public class MyThread extends Thread

public class MyThread implements Runnable

	{

	public void run()
	{
		for(int i=0;i<=3;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args)
	
	{
	MyThread mt=new MyThread();
	Thread t=new Thread(mt);
	//mt.start();
	t.start();
	MyThread mt1=new MyThread();
	Thread t1=new Thread(mt1);
	//mt1.start();
	t1.start();
	
	}
}

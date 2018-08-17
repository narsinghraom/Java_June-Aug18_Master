package com.vtalent.narendar;

public class SynchronizedExample extends Thread {

	public synchronized void function(int i)
	{
		//System.out.println(i);
		System.out.println(Thread.currentThread().getName()+i);

	}
	public void run(){
	for(int i=0;i<=3;i++)
	{
		function(i);
	}
}
public static void main(String[] args)

{
	SynchronizedExample se=new SynchronizedExample();
	se.setName("abc");
	se.start();
	SynchronizedExample se1=new SynchronizedExample();
	se1.setName("xyz");
	se1.start();
	
}
}

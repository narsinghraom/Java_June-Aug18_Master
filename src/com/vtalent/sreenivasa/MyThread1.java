package com.vtalent.sreenivasa;

public class MyThread1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 t=new MyThread1();
		Thread t1=new Thread(t);
		t1.start();
		/*Thread t2=new Thread(new MyThread1());
		t2.start();*/

	}

}

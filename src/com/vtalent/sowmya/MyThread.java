package com.vtalent.sowmya;

public class MyThread extends Thread{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		MyThread mt=new MyThread();
		mt.start();
		MyThread mt1=new MyThread();
		mt1.start();
	}
	

}

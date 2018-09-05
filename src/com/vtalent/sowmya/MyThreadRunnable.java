package com.vtalent.sowmya;



public class MyThreadRunnable implements  Runnable {
	public void run()
	{
		for(int i=0;i<3;i++)
		{
			System.out.println(i);
		}
		
	}
		public static void main(String[] args)
		{
			MyThreadRunnable mt=new MyThreadRunnable();
			Thread t=new Thread(mt);
			t.start();
			
		}
			
			
			
	


}

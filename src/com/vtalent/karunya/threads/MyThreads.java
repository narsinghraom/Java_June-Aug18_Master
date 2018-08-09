package com.vtalent.karunya.threads;

public class MyThreads {
	public void run(){
		for(int i=0; i<=3;i++)
		{
			System.out.println(i);
		}
	}
	public static void main (String[] args){
		MyThreads mt=new MyThreads();
		 mt.start();
		 //mt.start();
		MyThreads mt1=new MyThreads();
		mt1.start();
		//mt1.run();
	}
	private void start() {
		// TODO Auto-generated method stub
		
	}

}

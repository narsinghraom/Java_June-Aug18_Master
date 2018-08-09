package com.vtalent.karunya.threads;

public class MyThread implements Runnable {
	public void run(){
		for(int i=0;i<=3; i++){
			System.out.println(i);
		}
	}
		public static void main(String[] args){
			MyThread mt=new MyThread();
			Thread t=new Thread(mt);
			t.start();
			Thread t1=new Thread(new MyThread());
					t1.start();
			
		}
	}
	



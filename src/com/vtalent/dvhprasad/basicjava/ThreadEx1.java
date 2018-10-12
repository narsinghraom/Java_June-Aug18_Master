package com.vtalent.dvhprasad.basicjava;

public class ThreadEx1 implements Runnable {

	public void run() {
	for (int i=1;i<=5;i++){
		System.out.println(i);
	}
	}
public static void main(String[] args) {
	ThreadEx1 te=new ThreadEx1();
	Thread t=new Thread(te);
	t.start();
}
}

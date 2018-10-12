package com.vtalent.dvhprasad.basicjava;

public class ThreadEx extends Thread {
public void run(){
	for(int i=1;i<=5;i++){
		System.out.println(i);
	}
}
public static void main(String[] args) {
	ThreadEx te=new ThreadEx();
	ThreadEx te1=new ThreadEx();
	te.start();
	te1.start();
}
}

package com.vtalent.dvhprasad.basicjava;

public class ConEx2 {
	int i,j;
	ConEx2(){
		this(2,3);
		i=5;j=10;
	}
	ConEx2(int i){
		this.i=this.i+i;
		j=j+i;
	}
	ConEx2(int i,int j){
		this(i+j);
		this.i=this.i+i;
		this.j=this.j+j;
	}
	public static void main(String[] args) {
		ConEx2 ce=new ConEx2();
		System.out.println(ce.i);
		System.out.println(ce.j);
	}
}

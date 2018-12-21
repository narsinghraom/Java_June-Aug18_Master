package com.vtalent.dvhprasad.basicjava;

public class ConEx1 {
	int i, j;
	ConEx1(){
	i=5;j=10;
	}
ConEx1(int i){
	this.i=this.i+i;
	j=j+i;
}
ConEx1(int i,int j){
	this.i=this.i+i;
	this.j=this.j+j;
	
}
public static void main(String[] args) {
	ConEx1 Ce=new ConEx1();
	ConEx1 Ce1=new ConEx1(5);
	ConEx1 Ce2=new ConEx1(2,3);
	System.out.println(Ce.i);
	System.out.println(Ce.j);
	System.out.println(Ce1.i);
	System.out.println(Ce1.j);
	System.out.println(Ce2.i);
	System.out.println(Ce2.j);
	
}
}

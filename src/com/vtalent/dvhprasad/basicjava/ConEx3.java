package com.vtalent.dvhprasad.basicjava;

public class ConEx3 {
	int i,j;
ConEx3(){
	this(2,3);
	
}
ConEx3(int i){
	this.i=this.i+i;
	j=j+i;
}
ConEx3(int i,int j){
	this(i+j);
	this.i=this.i+i;
	this.j=this.j+j;
}
public static void main(String[] args) {
	ConEx3 ce=new ConEx3();
	System.out.println(ce.i);
	System.out.println(ce.j);
}
}
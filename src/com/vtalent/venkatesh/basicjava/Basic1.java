package com.vtalent.venkatesh.basicjava;

public class Basic1 {
int i=20;
int j=30;
float f=2.8f;
double d=4.7;
public void function(int i,int j ){
	this.i=i+this.i;
	this.j=j+this.j;
}
public float functionone(int i,float f){
	this.i=i+this.i;
	this.f=f+this.f;
	return f=this.i+this.f;
}
public double functiontwo(int j,double d){
	this.j=j+this.j;
	this.d=d+this.d;
	return d=this.j+this.d;
}
	public static void main(String[] args) {
		Basic1 ce=new Basic1();
		ce.function(2, 4);
		ce.functionone(5,2.4f);
		ce.functiontwo(6,4.6);
		System.out.println(ce.i);
		System.out.println(ce.j);
		System.out.println(ce.f);
		System.out.println(ce.d);
	}
}

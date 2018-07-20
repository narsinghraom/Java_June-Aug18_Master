package com.vtalent.jyothsna;

public class Example {
	int i,j;
	public void function(int i) {
		this.i=i+this.i;
		j=this.i+j;
		}
	public void function(int i,int j) {
		this.i=this.i+this.j+i;
		this.j=this.j+j;
	}
}
class Example3 extends Example{
	int i;
	public void function(int i,int j) {
		//super.funtion(i,j);
		this.i=super.i+i;
		this.j=j+super.j;
	}
	}


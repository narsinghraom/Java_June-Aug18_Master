package com.vtalent.venkatesh.basicjava;

public class Basic2 {
	int a=10;
	int b=20;
	public void function(int a,int b){
     this.a=a+this.a;
     this.b=b+this.b;
	}
	public static void main(String[] args) {
		Basic2 ce=new Basic2();
		ce.function(3, 5);
		System.out.println(ce.a);
		System.out.println(ce.b);
	

	}

}

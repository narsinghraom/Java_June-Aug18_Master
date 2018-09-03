package com.vtalent.arun.basics;

public class ConExmp {
		int i,j;
	
	ConExmp()
	{                          
int i=5, j=10;
	}
	ConExmp(int i){
	this.i=this.i+i;
	j=j+i;
	}
	ConExmp(int i,int j)
	{                    
	this.i=this.i+i;
	this.j=this.j+j;
	}
	public static void main(String[] args){
	ConExmp ce=new ConExmp();
	ConExmp ce1=new ConExmp(5);
	ConExmp ce2=new ConExmp(2,3);
	System.out.println(ce.i);
	System.out.println(ce.j);
	System.out.println(ce1.i);
	System.out.println(ce1.j);                        
	System.out.println(ce2.i);
	System.out.println(ce2.j);
	}}


package com.vtalent.dvhprasad.basicjava;
class Firste{
	int i,j;
	public int function (int i){
	this.i=i+this.i;
	this.j=i+this.j;
	return i;
	}
	public void function(float f1,int i){
		this.i=this.i+i;
		j=(int)f1+this.j;
}
}
class Seconde extends Firste{
	int i;
	public int function(int i){
		i=i+super.function(i);
		this.i=this.i+i;
		return i;
	}
	public void function(double d1,double d2){
		this.i=this.i+(int)(d1+d2);
		super.i=super.i+this.i;
		
	}
}
public class Test2 {
public static void main(String[] args) {
	Firste f=new Seconde();
	f.i=5;
	f.j=7;
	System.out.println(f.i+f.j);//12
	System.out.println(f.i);//5
	System.out.println(f.function(f.i+f.j));//
	f.i=(f.i+f.function(f.i+f.j));
	f.j=f.j;//(int)f.function(25.0,25.0);
	System.out.println(f.i);
	System.out.println(f.j);
}
}

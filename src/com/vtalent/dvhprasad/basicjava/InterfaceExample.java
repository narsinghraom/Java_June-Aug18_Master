package com.vtalent.dvhprasad.basicjava;

interface Abc1{
	void function(int x);
	void function(int x,int y);
}
interface Xyz{
	void function(int x);
	void function(String str);
}
class AbcImpl implements Abc1{
	public void function(int x){
		System.out.println(x);
	}
	public void function(int x,int y){
		System.out.println(x+y);
	}
}
class XyzImpl extends AbcImpl implements Xyz{
	public void function(String str){
		System.out.println(str.charAt(0));
	}
}

public class InterfaceExample {
public static void main(String[] args) {
	/*Abc1 abc=new AbcImpl();*/
	Abc1 abc=new XyzImpl();
	Xyz xyz=new XyzImpl();
	
	abc.function(2);
	abc.function(2,2);
	xyz.function(2);
	xyz.function("HELLO");
}
}

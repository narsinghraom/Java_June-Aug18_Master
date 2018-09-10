package com.vtalent.dvhprasad.basicjava;

abstract class Calculator
{
	public int add(int i,int j){
		return i+j;
	}
	public int sub(int i,int j){
		return i-j;
	}
	public abstract int mul(int i,int j);
	public abstract int div(int i,int j);
	
	
}
class MyCalculator extends Calculator{
	public int mul(int i,int j){
		return i*j;
	}
	public int div(int i,int j){
		return i/j;
	
	}
}
public class AbstractClass {
	public static void main(String[] args) {
		MyCalculator mc=new MyCalculator();
		System.out.println(mc.add(8,2));
		System.out.println(mc.sub(8,2));
		System.out.println(mc.mul(8,2));
		System.out.println(mc.div(8,2));
	}
}
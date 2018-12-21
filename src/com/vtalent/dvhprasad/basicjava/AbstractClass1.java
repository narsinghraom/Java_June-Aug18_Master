package com.vtalent.dvhprasad.basicjava;

abstract class Calculator1
{
	public int add(int i,int j){
		return i+j;
}
	public int sub(int i,int j){
		return i-j;
	}
	abstract public int mul(int i,int j);
	abstract public int div(int i,int j);

}
abstract class MyCalculator1 extends Calculator1
{
	public int mul(int i,int j){
		return i*j;
	}
	abstract public int div(int i,int j);
}
class MyCalculator2 extends MyCalculator1
{
	public int div(int i,int j){
		return i/j;
	}
}
public class AbstractClass1 {
	public static void main(String[] args) {
	MyCalculator2 mc=new MyCalculator2();
	System.out.println(mc.add(8,2));
	System.out.println(mc.sub(8,2));
	System.out.println(mc.mul(8,2));
	System.out.println(mc.div(8,2));
}
}

package com.vtalent.kalyani.basics;
interface Abc1
{
	void function(int x);
	void function(int x, int y);
}
interface xyz1
{
	void function(int x);
	void function(String str);
}
interface mnr extends Abc1,xyz1
{

}
class Third2 extends Second implements mnr
{
	
}
public class InterfaceExample2 {

	public static void main(String[] args) {
		mnr m=new Third2();
		m.function(2);
		m.function(2, 3);
		m.function("hi");
		m.getClass();

	}

}

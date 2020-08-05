package com.vtalent.narendar;

public class LocalInnerExample {
 int i;
 void function()
 {
	 class LocalInner{
		 int k;
		 public void function(){
			 System.out.println(k+i);
		 }}
	 LocalInner li=new LocalInner();
	 li.k=10;
	 li.function();
	 
 }
 public static void main(String[] args)
 {
	 LocalInnerExample lie=new LocalInnerExample();
	 lie.i=10;
	 lie.function();
 }
}

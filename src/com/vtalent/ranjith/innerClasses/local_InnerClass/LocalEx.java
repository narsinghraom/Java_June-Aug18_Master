package com.vtalent.ranjith.innerClasses.local_InnerClass;

public class LocalEx {
int i;
void function(){
	class LocalInner{
		int k;
		public void function(){
			System.out.println(k+i);
		}		
	}
	LocalInner li=new LocalInner();
	li.k=10;
	li.function();
	
}
public static void main(String[] args) {
	LocalEx le=new LocalEx();
	le.i=20;
	le.function();
}
}

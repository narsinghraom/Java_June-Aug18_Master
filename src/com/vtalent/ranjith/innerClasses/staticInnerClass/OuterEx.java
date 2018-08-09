package com.vtalent.ranjith.innerClasses.staticInnerClass;

public class OuterEx {
private int i=10;
public void function(int i){
	System.out.println(this.i+i);//12
}
static class InnerEx{
	float f=1.5f;
	
	public static void function(float f){
		 OuterEx o=new OuterEx();
		o.function((int)f);		 
		InnerEx e1=new InnerEx();
		System.out.println(e1.f+f);
	}
}
public static void main(String[] args) {
	
	
	/*OuterEx.InnerEx ie=new OuterEx.InnerEx();
	ie.function(2.5f);*/
	OuterEx.InnerEx.function(2.5f);
}
}
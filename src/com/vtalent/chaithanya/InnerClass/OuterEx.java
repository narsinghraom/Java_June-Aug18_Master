package com.vtalent.chaithanya.InnerClass;

public class OuterEx {
	private int i=10;
	public void function(int i){
		System.out.println(this.i+i);//15
	}
	class InnerEx{
		float f=1.5f;
		public void function(float f){
//			OuterEx o = new OuterEx();
//			o.function((int)f);    OR
			
			OuterEx.this.function((int)f);
			System.out.println(this.f+f);
		}
	}
	public static void main(String[] args) {
		OuterEx oe=new OuterEx();
		System.out.println(oe.i);//10
		oe.function(5);
		
		OuterEx.InnerEx ie=oe.new InnerEx();
		System.out.println(ie.f);//1.5
		ie.function(2.5f);
		System.out.println(ie.f);
		
	}
}

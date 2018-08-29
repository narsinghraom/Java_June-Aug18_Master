package com.vtalent.sahithi;

public class OuterEx1 {
private int i=10;
	
	public void function(int i){
		
		System.out.println(this.i+i);
	}
	static class InnerEx1 {
		float f=1.5f;
		public static void function(float f){
			OuterEx1 oe=new OuterEx1();
			oe.function((int)f);
			
			InnerEx1 ie=new InnerEx1();//if we don't create obj to innerclass then the value of f=2.5 since this can't be used in static method
			System.out.println(ie.f+f);//1.5+2.15=4.0
		}
	}	
	public static void main(String[] args) {
		/*OuterEx oe=new OuterEx();
		OuterEx.InnerEx ie=oe.new InnerEx();*/
//		OuterEx1 ie1=new OuterEx1();
//		ie1.function(2.5f);
		OuterEx1.InnerEx1.function(2.5f);
		
	}

}



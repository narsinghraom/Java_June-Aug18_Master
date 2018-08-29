package com.vtalent.sahithi;

public class OuterEx {
	private int i=10;
	
	public void function(int i){
		
		System.out.println(this.i+i);
	}
	public class InnerEx {
		float f=1.5f;
		public void function(float f){
			OuterEx oe=new OuterEx();
			oe.function((int)f);
			System.out.println(this.f+f);
		}
		
	}
	
	public static void main(String[] args) {
		/*OuterEx oe=new OuterEx();
		OuterEx.InnerEx ie=oe.new InnerEx();*/
		OuterEx.InnerEx ie=new OuterEx().new InnerEx();
		ie.function(2.5f);
	}

}




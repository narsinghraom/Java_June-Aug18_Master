package com.vtalent.prasad;

class OuterExample {
	private int i=10;
	public void fucntion (int i){
		System.out.println(this.i+i);
	}
	class InnerExample{
		float f=1.3f;
		void m(int k){
			System.out.println(k);
		}
		void fucntion(float f)
		{
			OuterExample e=new OuterExample();
			e.fucntion((int)f);
			System.out.println(this.f+f);
	
		}
}
	public static void main(String args[])
	{
		OuterExample oe=new OuterExample();
		OuterExample.InnerExample ie= oe.new InnerExample();
		ie.fucntion(2.2f);
	}
			
	}


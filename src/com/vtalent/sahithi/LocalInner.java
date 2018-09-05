package com.vtalent.sahithi;

public class LocalInner {
	int i;
	void function()
	{
		class Localinner{
			int k;
			public void function(){
				System.out.println(k+i);
			}
		}
				Localinner li=new Localinner();
				li.k=10;
				li.function();
			}
		
		
	public static void main(String[] args) {
		LocalInner le=new LocalInner();
		le.i=10;
		le.function();
	}

}

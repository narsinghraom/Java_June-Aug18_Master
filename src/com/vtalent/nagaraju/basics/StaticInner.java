package com.vtalent.nagaraju.basics;

public class StaticInner {
	int i;
	public void function(int i){
		this.i=i;
		i++;
		System.out.println(i);
	}
	static class Inner {
		int i;
		StaticInner si=new StaticInner();
		public void function(){
			si.function(i);
			
		}
	}
   public static void main(String[] args) {
	StaticInner.Inner inner=new Inner();
	inner.i=5;
	inner.function();
	//System.out.println(si.i);
}
}

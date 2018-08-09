package com.vtalent.sahithi;

public class Anonymous1 {
	public static void main(String[] args) {
		Anonymous a=new Anonymous(){
			public void function(int i){
				System.out.println(i);
			}
		};
		a.function(5);
	}

}

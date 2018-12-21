package com.vtalent.dvhprasad.basicjava;

public class First{
		int i,j;
		public void function(int i){
			this.i=i+i;
			j=i;
			
		}
	}
	class Secondary extends First{
		int i,j;
		public void function(int i,int j){
			this.j=j+i;
			super.i=super.i+i;
		}
	}
	
	
	


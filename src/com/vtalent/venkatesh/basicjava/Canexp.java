package com.vtalent.venkatesh.basicjava;

public class Canexp {
	int i,j;
	Canexp(){
		i=5;j=10;
	}
		Canexp(int i){
			this.i=this.i+i;
			j=j+i;
		}
		Canexp(int i,int j){
			this.i=this.i+i;
			this.j=this.j+j;
		}
	public static void main(String[] args) {
     Canexp ce=new Canexp();
     Canexp ce1=new Canexp(2);
     Canexp ce2=new Canexp(2,3);
     System.out.println(ce.i);
     System.out.println(ce.j);
     System.out.println(ce1.i);
     System.out.println(ce1.j);
     System.out.println(ce2.i);
     System.out.println(ce2.j);
	}
}

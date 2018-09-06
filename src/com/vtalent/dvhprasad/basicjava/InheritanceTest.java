package com.vtalent.dvhprasad.basicjava;

class First1{
	int i, j;
	public void function(int i){
		this.i=i+j;//5
		j=this.i+j;//5
	}
}
class Second1 extends First1{
	int i,j;
	public void function(int i,int j){
		this.i=i+j;
		this.j=super.i+this.i;
	}
}
class Third1 extends Second1{
	int i,j;
	public void function(int i,int j){
		this.i=i+j;//
		j=this.i+super.i;
		
	}
}
public class InheritanceTest {
public static void main(String[] args) {
	First1 f=new First1();
	f.function(2);
	System.out.println(f.i);//2
	System.out.println(f.j);//2
	
	Second1 s=new Second1 ();
	s.function(5);
	s.function(2,5);
	System.out.println(s.i);//7
	System.out.println(s.j);//12
	
	Third1 t=new Third1();
	t.function(5);
	t.function(8,3);
	System.out.println(t.i);//11
	System.out.println(t.j);//0

	
}
}

package com.vtalent.dvhprasad.basicjava;

public class Inheritancetest1 {
public static void main(String[] args) {
	First1 f=new First1();
	f.function(2);
	System.out.println(f.i);//2
	System.out.println(f.j);//2
	First1 f1=new Second1();
	f1.function(2);
	System.out.println(f1.i);//2
	System.out.println(f1.j);//2
	First1 f2=new Third1();
	f2.function(4);
	System.out.println(f2.i);//4
	System.out.println(f2.j);//4
	
	/*Second1 s1=new First1();
	s1.function(2)*/ /*cannot convert from child class to parent class*/
	
	Second1 s2=new Second1();
	s2.function(5);
	s2.function(2,3);
	System.out.println(s2.i);//5
	System.out.println(s2.j);//10
	
	Second1 s3=new Third1();
	s3.function(5);
	s3.function(8,3);
	System.out.println(s3.i);//0
	System.out.println(s3.j);//0
	
	/*Third1 t1=new First1();
	t1.function()5*//*cannot convert from child class to parent class*/
	
	/*Third1 t2=new Second1();
	t2.function(5,6);*//*cannot convert from child class to parent class*/
	
	Third1 t3=new Third1();
	t3.function(8);
	t3.function(6,8);
	System.out.println(t3.i);//14
	System.out.println(t3.j);//0
}
}

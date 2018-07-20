package com.vtalent.jyothsna;

 class SampleOne {
	 float f1,f2;
	 public void function(float f1) {
		 this.f1=f1+f2;
		 }
	 public void function(float f1,float f2) {
		 this.f1=this.f1+f1;
		 this.f2=this.f2+f2;
		 }
 }
	 class SampleTwo extends SampleOne{
		 int i;
		 float f1;
		 public void function(int i) {
			 this.i=i+i;
			 }
		 public void function(float f1) {
			 this.f1=f1+super.f1;
			 }
		 }
class SampleThree extends SampleTwo{
	long l;
	float f1;
	public void function(long l,float f1) {
		this.l=l;
		this.f1=f1;
		}
	}
class Check1{

	public static void main(String[] arg)
	{
//		SampleThree st=new SampleThree();
//		st.function(25,1.5f);
//		st.function((int)st.l);
//		st.function(st.f1);
//		st.function(st.f1,st.f1);
//		System.out.println(st.i);
//		System.out.println(st.l);
//		System.out.println(st.f1);
//     		System.out.println(st.f2);
//		
		SampleTwo st2=new SampleThree();
		st2.function(25,1.5f);
		//st2.function((int)st2.l);
		st2.function(st2.f1);
		st2.function(st2.f1,st2.f1);
		//System.out.println(st2.i);
		//System.out.println(st2.l);
		System.out.println(st2.f1);
		System.out.println(st2.f2);
		
}
 }
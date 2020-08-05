package com.vtalent.jyothsna;

public class SampleProgram {
	static int i,j;
	 float f1;
      float f2;
	public void FunctionOne() {
		f1=1.5f;
		f2=1.5f;
	}
public static float FunctionTwo(int i,int j) {
	SampleProgram.i=i+j;
	SampleProgram.i=i*j;
	return(float)SampleProgram.i;
}
public int FunctionThree(float f1,float f2) {
	this.f1=f1+this.f1;
	this.f2=f2+this.f2;
	return(int)(this.f1);
}
public static void main(String arg[]) {
	SampleProgram sp=new SampleProgram();
	sp.FunctionOne();
	float f1=FunctionTwo((int)sp.f1,(int)sp.f2);
	//int k=FunctionThree(f1,f2);
	//System.out.println(k);
	System.out.println(f1);
	System.out.println(sp.f1);
	System.out.println(i);
	System.out.println(SampleProgram.i);
}
	
	
}



package com.vtalent.dvhprasad.basicjava;

public class ArrayEx {
	int[] i=new int[3];
	float[] f;
	public float[] function(int[] i){
		f=new float[i.length];
		for(int k=0;k<=i.length-1;k++){
			f[k]=i[k];
		}
		return f;
	}
public static void main(String[] args) {
	ArrayEx ae=new ArrayEx();
	for(int k=0;k<=ae.i.length-1;k++){
		ae.i[k]=k+5;
	}
	float[] f=ae.function(ae.i);
	for(int m=0;m<=f.length-1;m++){
		System.out.println(f[m]);
	}
	System.out.println(f);
	System.out.println(ae.i);
}
}

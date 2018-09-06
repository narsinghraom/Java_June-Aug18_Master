package com.vtalent.dvhprasad.basicjava;

public class ALoop {
int i;
ALoop al=new ALoop();
public static void main(String[] args) {
	ALoop al=new ALoop();//stack over flow due to the object recursionS
	System.out.println(al.i);
}
}

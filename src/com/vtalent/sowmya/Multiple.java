package com.vtalent.sowmya;

public class Multiple {
	public void m1()
	{
		System.out.println("Are you Free Now ?");
	}
	public void m2()
	{
		System.out.println("Whats your problem?");
	}
}
	


class Inheritence extends Multiple
{
	 public void m2()
	 {
		 System.out.println("hii to all");
	 }
	 public void m3()
	 {
		 System.out.println("Special method of inheritence class");
	 }
	 public static void main(String[] args) {
		 Inheritence i=new Inheritence();
		 i.m1();
		 i.m2();
		 i.m3();
		
	}
}

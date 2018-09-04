package com.vtalent.saikrishna.system;

import java.util.ArrayList;
public class ArrayList1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> a1=new ArrayList<>();
		ArrayList<String> a2=new ArrayList<>();
		a1.add("sai");
		a1.add("krishna");
		a2.add("abc");
		a2.add("xyz");
		a1.add("xyz");
		a1.add("pqr");
		Object[] o1=a1.toArray();
		/*for(int i=0;i<o1.length;i++)
		{
			System.out.println(o1[i]);
		}
		for(String s1:a2)
		{
			System.out.println(s1);
		}*/
		
		
		for(int i=0;i<a1.size();i++)
		{
			System.out.println(a1);
		}
		//a1.clone();
	}
}

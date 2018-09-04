package com.vtalent.sreenivasa;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		System.out.println("the size of arraylist is:"+al.size());
		System.out.println("the arraylist is empty or not:"+al.isEmpty());
		al.add("sreenu");
		al.add("gopal");
		al.add(10);
		al.add(20);
		System.out.println(al);
		System.out.println("the size of arraylist is:"+al.size());
		System.out.println("the arraylist is empty or not:"+al.isEmpty());
		System.out.println("to remove the element of arraylist:"+al.remove(1));
		System.out.println("the element is removed or not:"+al.contains(1));
		System.out.println(al);
		System.out.println("to get the particular index:"+al.get(0));
		//System.out.println(al.getClass());
		System.out.println("the element is removed or not:"+al.contains(al));
		//System.out.println(al.removeAll(al));
		System.out.println(al);
		Object[] obj=al.toArray();
		for(int i=0;i<obj.length;i++)
		{
		System.out.println(obj[i]);
		}
		
		System.out.println(al.set(1,40));//inserting element 40 at 1st position
		System.out.println(al);
		
		ArrayList al1=new ArrayList();
		al1.add("venky");
		al1.add("reddy");
		al1.add(60);
		System.out.println(al1);
		al1.addAll(al);
		System.out.println(al1);
		System.out.println(al1.subList(0,1));//return portion of the list

	}

}

package com.vtalent.kalyani.basics;

import java.util.ArrayList;

public class ArrayExample {
	public static void main(String[] args) {
		
	ArrayList<String> la =new ArrayList<String>(3);
	ArrayList<String> l2 =new ArrayList<String>();
	la.add("kalyani");
	la.add("ashu");

	l2.add("hi");
	l2.add("hello");
	la.addAll(l2);
	
	
	//la.clear();
	System.out.println(la);
	
	
	}

}

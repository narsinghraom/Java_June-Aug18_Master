package com.vtalent.sowmya;


	import java.util.*;
	class Demo
	{
	 public static void main(String args[])
	 {
	  ArrayList< String> hs = new ArrayList< String>();
//	  hs.trimToSize(); 
	  
	//Adding the data	  
	  
	  hs.add("Bharath");
	  hs.add("Angel");
	  hs.add("Dangour");
	  hs.add("Enjoy");
	  hs.add("Cutee");
	  hs.add("Flower");
	  
	  //removing index value
	  hs.remove(1);
	  System.out.println(hs);
	  
	  //Here removing the data
	  hs.remove("Bharath");
	  hs.add(0,"chinnu");
	  
	//here the the data is empty
	  System.out.println("given data is empty?:"+hs.isEmpty());
	  
	  //here we display list of list
	  System.out.println("size of the list:"+hs.size());
	  
	  //retrieve the elements from the index
	  String firstName=hs.get(0);
	  String secondName=hs.get(1);
	  String thirdName=hs.get(hs.size()-1);
	  System.out.println("FIRST NAME:"+firstName);
	  System.out.println("SECONDNAME:"+secondName);
	  System.out.println("THIRD NAME:"+thirdName);
	  
	  //Modify element at the given index
	  hs.set(1,"joe");
	  System.out.println(hs);
	  
//	check list contains given element
	  System.out.println("list contains given element:"+hs.contains("joe"));
	  System.out.println("list contains given element:"+hs.contains("hello"));
	  
//	  find the index of first occurrence of an element
	  System.out.println("index of first occurrence of an element:"+hs.indexOf("cutee"));
	  System.out.println("index of last occurrence of an element:"+hs.lastIndexOf("chinnu"));  
	  System.out.println(hs);
	  
	  
	  
	 
	  
	 List<String> Languages = new ArrayList<>();
      Languages.add("Python");
      Languages.add("Ruby");
      Languages.add("Perl");
	  hs.removeAll(Languages);
	 
	  hs.retainAll(Languages);
	  System.out.println("retain the data:"+hs);
	  hs.addAll(Languages);
	  
	  System.out.println("add the data:"+hs);
	  
//	  remove the elements from the array list
	  hs.clear();
	  System.out.println("clear all:"+hs);
	  
	  
	  
	 }
	}



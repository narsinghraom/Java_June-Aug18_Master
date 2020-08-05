package com.vtalent.narendar;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListExample implements Cloneable  {
	
	public static void main(String[] args)
	{
		ArrayList<String> arrayList=new ArrayList<String>();
		
		arrayList.add("narendar");
		arrayList.add("nalla");
		arrayList.add("reddy");
		arrayList.add("dvh");
		System.out.println("ArrayList variable is "+arrayList);
		Iterator itr=arrayList.iterator();
		while(itr.hasNext())
		{
			String str=(String)itr.next();
			//System.out.println("Iterator Variable is"+itr);
			System.out.println("Iterator output is");
			System.out.println(str);
		}
		
		
		LinkedList<String> linkedList=new LinkedList<String>();
		linkedList.add("100");
		linkedList.add("200");
		linkedList.add("300");
		System.out.println("LinkedList variable is"+linkedList);
		for(String str1:linkedList)
		
		System.out.println(str1);
		
		
		//ArrayList methods
		
		linkedList.addAll(arrayList);
		System.out.println("After adding arraylist,inkedlist is"+linkedList);
		
		/*linkedList.clear();
		System.out.println(linkedList);*/
		
		Boolean b=arrayList.contains("nalla");
		System.out.println(b);
		
		String s=arrayList.get(2);
		System.out.println(s);
		
		int n=arrayList.size();
		System.out.println(n);
		
		Object[] o=arrayList.toArray();
		System.out.println(o);
		for(Object o1:o)
		System.out.println(o1);
		
		List<String> l=arrayList.subList(1, 2);
		System.out.println("list output is"+l);
		
		
		Collection<String> l1=arrayList.subList(0,2);
		System.out.println("last output"+l1);
	
		/*linkedList.clear();
		System.out.println("after clear"+linkedList);
		*/
		
		arrayList.remove(1);
		System.out.println(arrayList);
		
		arrayList.add(1,"Prasad");
		System.out.println(arrayList);
		
		Boolean b1=arrayList.remove("dvh1");
		System.out.println(b1);
		System.out.println(arrayList);
		
		
		//arrayList.removeAll(arrayList);
		//System.out.println(arrayList);
		
		Object o2=arrayList.clone();
		ArrayList<String> all=(ArrayList<String>)o2;
		System.out.println(all);
		//String s2=(String)o2;
		System.out.println("clone"+o2);
		
		
		
		
		}
	    }

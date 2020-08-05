package com.vtalent.narendar;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	
	public static void main(String args[])
	{
		
	Map<A,String> map=new HashMap<A,String>();
	A a1=new A();
	a1.i=10;
	a1.j=20;
	A a2=new A();
	a2.i=10;
	a2.j=20;
	A a3=new A();
	a3.i=50;
	a3.j=60;
	map.put(a1,"first");
	map.put(a2, "second");
	map.put(a3, "third");
	System.out.println(map);
	
	for(Map.Entry<A, String> mapKey:map.entrySet())
	{
	 System.out.println(mapKey.getKey()+"="+mapKey.getValue());
	}
	}
}

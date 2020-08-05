package com.vtalent.narendar;

import java.io.*;

public class SerializationExample implements Serializable
{
	
	int id;
	String name;
	double salary;
	public static void doSerialization() throws Exception
	{
		SerializationExample se=new SerializationExample();
		
		se.id=100;
		se.name="info";
		se.salary=25000.0;
		File file=new File("C:/Narendar/Programs/serial.txt");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(se);
		System.out.println("Serialization Done");
	}
	public static void deSerialization() throws Exception
	{
		FileInputStream fis=new FileInputStream("C:/Narendar/Programs/serial.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=ois.readObject();
		
		if(o!=null)
		{
			SerializationExample se=(SerializationExample)o;
			System.out.println(se.id);
			System.out.println(se.name);
			System.out.println(se.salary);
			System.out.println("de serialzation done");
		}}
	public static void main(String[] args) throws Exception
	{
	
		
		doSerialization();
		deSerialization();
		
	}

}

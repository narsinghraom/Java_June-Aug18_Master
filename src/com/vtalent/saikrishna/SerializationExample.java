package com.vtalent.saikrishna;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample implements Serializable
{
	int id;
	String name;
	double salary;
	
	public static void doSerialization()
	{
		try{
		SerializationExample se=new SerializationExample();
		se.id=1122;
		se.name="sai";
		se.salary=25000.00;
		
		File file=new File("F:\\sai.txt");
		FileOutputStream fos=new FileOutputStream(file);
	ObjectOutputStream oos=new ObjectOutputStream(fos);
	oos.writeObject(se);
	System.out.println("object created ");
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void deSerialization()
	{
		try{
		FileInputStream fis=new FileInputStream("f:\\sai.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=ois.readObject();
		
			SerializationExample se1=(SerializationExample)o;
			System.out.println("id="+se1.id);
			System.out.println("name="+se1.name);
			System.out.println("salary="+se1.salary);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void f1()
	{
		try{
		FileOutputStream fos1=new FileOutputStream("f://one.txt");
		String s1="saikrishna";
		byte b[]=s1.getBytes();
		fos1.write(b);
		System.out.println("datainserted");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void f2()
	{
		try{
		FileInputStream fis1=new FileInputStream("f://one.txt");

		
	
	
		//System.out.println(i);
	//	System.out.println(fis1.read());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) 
	{
		//f1();
		f2();
		//doSerialization();
	//	deSerialization();
	}
}

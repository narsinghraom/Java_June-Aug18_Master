package com.vtalent.sreenivasa;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableExample implements Serializable
{
	int id;
    String name;
    double salary;
	public static void doSerialization() throws Exception
	{
		SerializableExample se=new SerializableExample();
		se.id=101;
		se.name="sreenu";
		se.salary=25000.00;
		//try{
		File f=new File("f:/sreenu11.txt");
		FileOutputStream fos=new FileOutputStream(f);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(se);
		System.out.println("serialization is completed");
		/*}catch(IOException ie)
		{
			System.out.println("serialization is completed");
		}*/
	}
	public static void doSerialization1() throws Exception
	{
		//try{
		FileInputStream fis=new FileInputStream("f:/sreenu11.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=ois.readObject();
		if(o!=null){
		SerializableExample se=(SerializableExample)o;
		System.out.println("id is="+se.id);
		System.out.println("name is="+se.name);
		System.out.println("salary is="+se.salary);
		/*}
		}catch(FileNotFoundException fie)
		{
			
		}catch(Exception e)
		{
			
		}*/
		}
	}
	public static void main(String[] args) throws Exception
	{
		doSerialization();
		doSerialization1();
	}

}

package com.vtalent.sreenivasa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Sreenu extends TeamA implements Serializable
{

	public static void doSerializable() throws Exception
	{
		FileOutputStream fos=new FileOutputStream("f:/mahi2.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		TeamA a=new TeamA();
		oos.writeObject(a);
	}
	public static void deSerializable()throws Exception
	{

		FileInputStream fis=new FileInputStream("f:/mahi2.txt");
		ObjectInputStream oos=new ObjectInputStream(fis);
		Object o=oos.readObject();
	
		TeamA s=(TeamA)o;
		System.out.println(s);
		/*int ch;
		while((ch=fis.read())!=-1)
		{
			System.out.print((char)ch);
		}*/
		
	}
	public static void main(String[]args)throws Exception
	{
		doSerializable();
		deSerializable();
		
	}
}

package com.vtalent.kalyani.basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class SerializationExample implements Serializable{
	int empid;
	String empname;
	double empsalary;
	int adress;
	
	public static void doserialization()throws Exception{
		SerializationExample emp=new SerializationExample();
		emp.empid=200;
		emp.empname="kalyani";
		emp.empsalary=25000.00;
		emp.adress=123;
		
		//final long serialVersionUID=1L;
		File file=new File("‪C:\\Users\\Ram\\Desktop\\asu.txt");						//cerating file
		FileOutputStream fos=new FileOutputStream(file);			 //reading file
		ObjectOutputStream oos=new ObjectOutputStream(fos);			//reading the object in file
		oos.writeObject(emp);
		System.out.println(emp);
	}
	
	//deseralization
	
	public static void deserialization()throws Exception{
		FileInputStream fis=new FileInputStream("D:\\cfg.txt");
		
	/*	File file = new File("d:/testFile11.txt");
		//Create the file
				if (file.createNewFile())
				{
				   System.out.println("File is created!");
				} else {
				   System.out.println("File already exists.");
				}*/
				
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=ois.readObject();
		SerializationExample emp=(SerializationExample)o;
		System.out.println("id"+emp.empid);
		System.out.println("name"+emp.empname);
		System.out.println("salary"+emp.empsalary);
		System.out.println("adress"+emp.adress);
	}
	
	
	public static void main(String[] args) {
		
		
		try{
			//doserialization();//first run this one 
			deserialization();//second run this one 
			//createFile();
		}
		catch(Exception e){
		System.out.println(e);
	}
		}
	
	public static void createFile() throws Exception{
		SerializationExample emp = new SerializationExample();
		emp.empid = 200;
		emp.empname = "kalyani";
		emp.empsalary = 25000.00;
		emp.adress=123;
		File file = new File("D:\\cfg.txt");
		 
		//Create the file
		if (file.createNewFile())
		{
		   System.out.println("File is created!");
		} else {
		   System.out.println("File already exists.");
		}

		FileOutputStream fos = new FileOutputStream(file); // reading file
		ObjectOutputStream oos = new ObjectOutputStream(fos); // reading the object in file
		oos.writeObject(emp);

		System.out.println("emp data: "+emp);
		}

		
	}
	



package com.vtalent.kalyani.basics;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;



public class Serialization implements Serializable{
	
	int empid;
	String empname;
	double empsalary;
	public static void doserialization()throws Exception{
		Serialization emp=new Serialization();
		emp.empid=200;
		emp.empname="kalyani";
		emp.empsalary=25000.00;
		File file=new File("‪C:\\Users\\Ram\\Desktop\\asu.txt");						//cerating file
		FileOutputStream fos=new FileOutputStream(file);			 //reading file
		ObjectOutputStream oos=new ObjectOutputStream(fos);			//reading the object in file
		oos.writeObject(emp);
		System.out.println(emp);
	}
	
	//deseralization
	
	public static void deserialization()throws Exception{
		FileInputStream fis=new FileInputStream("‪‪‪C:\\Users\\Ram\\Desktop\\asu.txt");
				
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=ois.readObject();
		Serialization emp=(Serialization)o;
		System.out.println("id"+emp.empid);
		System.out.println("name"+emp.empname);
		System.out.println("salary"+emp.empsalary);
	}
	
	
	public static void main(String[] args) {
		
		try{
			doserialization();//first run this one 
			//deserialization();//second run this one 
		}
		catch(Exception e){
		System.out.println(e);
	}
		}
		
		
	}
	



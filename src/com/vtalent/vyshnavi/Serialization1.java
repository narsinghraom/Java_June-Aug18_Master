package com.vtalent.vyshnavi;


	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileOutputStream;
	import java.io.ObjectInputStream;
	import java.io.ObjectOutputStream;
	import java.io.Serializable;

	public class Serialization1 implements Serializable{
		
		int empid;
		String empname;
		double empsalary;
		public static void doserialization()throws Exception{
			Serialization1 emp=new Serialization1();
			emp.empid=100;
			emp.empname="vyshu";
			emp.empsalary=25000.00;
			File file=new File("C:\\Users\\DELL\\Desktop\\java\\cfg.txt");						//cerating file
			FileOutputStream fos=new FileOutputStream(file);			 //reading file
			ObjectOutputStream oos=new ObjectOutputStream(fos);			//reading the object in file
			oos.writeObject(emp);
		}
		
		//deseralization
		
		public static void deserialization()throws Exception{
			FileInputStream fis=new FileInputStream("C:\\Users\\DELL\\Desktop\\java\\cfg.txt");
			ObjectInputStream ois=new ObjectInputStream(fis);
			Object o=ois.readObject();
			Serialization1 emp=(Serialization1)o;
			System.out.println("id"+emp.empid);
			System.out.println("name"+emp.empname);
			System.out.println("salary"+emp.empsalary);
		}
		
		
		public static void main(String[] args) {
			
			try{
				//doserialization();//first run this one 
				deserialization();//second run this one 
			}
			catch(Exception e){
			System.out.println(e);
		}
			}
			
			
		}




		

package com.vtalent.dvhprasad.basicjava;

import java.io.*;

public class Employe implements Serializable {
	

	int empId;
	String empName;
	double empSalary;
	/*public static void doserialization() throws Exception{
		Employe emp=new Employe();
		emp.empId=100;
		emp.empName="Prasad";
		emp.empSalary=25000.0;
		
		File file=new File("C:\\JAVA\\serailztion.txt");
		FileOutputStream fos=new FileOutputStream(file);
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(emp);
		oos.close();
	}*/

	//deserailization

	public static void deserialization() throws Exception{
		FileInputStream fis=new FileInputStream("C:\\JAVA\\serial.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Object o=ois.readObject();
		Employe emp=(Employe)o;
		System.out.println("id="+emp.empId);
		System.out.println("Name="+emp.empName);
		System.out.println("Salary="+emp.empSalary);
	}
	public static void main(String[] args) {
		try{
		//	doserialization();
			deserialization();
		}
		catch(Exception e){
		System.out.println(e);
		}
}
}
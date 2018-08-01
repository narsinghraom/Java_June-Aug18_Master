package com.vtalent.chaithanya;

import java.io.IOException;

public class SerializationTest {
	
	public static void main(String[] args) {
		String fileName="employee.txt";
		EmployeeSerialization emp = new EmployeeSerialization();
		emp.setId(100);
		emp.setName("Pankaj");
		emp.setSalary(5000);
		
		//serialize to file
		try {
			SerializationUtil.serialize(emp, fileName);
		} catch (IOException e) {
			e.printStackTrace();
			return;
		}
		
		EmployeeSerialization empNew = null;
		try {
			empNew = (EmployeeSerialization) SerializationUtil.deserialize(fileName);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("emp Object::"+emp);
		System.out.println("empNew Object::"+empNew);
	}
}

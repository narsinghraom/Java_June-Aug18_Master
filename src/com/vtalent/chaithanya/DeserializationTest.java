package com.vtalent.chaithanya;

import java.io.IOException;

public class DeserializationTest {

	public static void main(String[] args) {

		String fileName="employee.txt";
		EmployeeSerialization empNew = null;
		
		try {
			empNew = (EmployeeSerialization) SerializationUtil.deserialize(fileName);
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("empNew Object::"+empNew);
		
	}
}

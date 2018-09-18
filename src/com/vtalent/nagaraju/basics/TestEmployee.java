package com.vtalent.nagaraju.basics;

import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		Employe employe=new Employe();
		System.out.println("enter the id");
		employe.setId(scanner.nextInt());
		System.out.println("enter the name");
		employe.setName(scanner.next());
		System.out.println("enter the salary");
		employe.setSal(scanner.nextDouble());
		System.out.println("enter the department");
		employe.setDepartment(scanner.next());
		
		System.out.println("empolye id--"+employe.getId()+
				"---empolye name----"+employe.getName()+
				"--empolyee salary--"+employe.getSal()+"--employee department--"+employe.getDepartment());

	}

}

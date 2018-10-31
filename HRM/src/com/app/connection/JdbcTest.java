package com.app.connection;

public class JdbcTest {
	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setEmpid(106);
		emp.setEmpname("sahi");
		emp.setEmpsalary(32000.00);
		JDBCExampl je=new JDBCExampl();
		int res=je.insertData(emp);
		je.displayall();
		
		System.out.println("1 row inserted");
	}

}

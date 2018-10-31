package com.hrm.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.app.connection.MyConnection;


public class DaoImpl {
	
	Connection connection;
	PreparedStatement preparedStatement;
	ResultSet resultSet;
	public DaoImpl(){
		connection=MyConnection.getInstance();
	}
	
	public int insertDataOfAnEmployee(EmployeeBean employeeBean){
		int result=0;
		String query="insert into employee values(?,?,?)";
		try {
			preparedStatement=connection.prepareStatement(query);
			preparedStatement.setInt(1, employeeBean.getEmployeeId());
			preparedStatement.setString(2, employeeBean.getEmployeeName());
			preparedStatement.setDouble(3, employeeBean.getEmployeeSalary());
			result=preparedStatement.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return result;
	}

}

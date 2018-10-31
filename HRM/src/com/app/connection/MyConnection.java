package com.app.connection;
import java.sql.*;
public class MyConnection {
	private static MyConnection mycon=new MyConnection();
	static Connection connection;
	private MyConnection(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/HRMDB","root","root");
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
	public static Connection getInstance(){
		return connection;
	}
	
}

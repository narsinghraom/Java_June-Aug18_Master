package com.vtalent.ashwini.basicjava;

import java.sql.*;


public class MysqlDbconnection 
{
	static MysqlDbconnection mb=new MysqlDbconnection();
	static Connection connection;
		private MysqlDbconnection()
		{
		try
		{
				Class.forName("com.mysql.jdbc.Driver");
				connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/j2eedb","root","root"); 
				
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		

	}
		public static Connection getinstance()
		{
			return connection;
		}
	

}

package com.vtalent.ashwini.basicjava;
import java.sql.*;
public class TestDb 
{
	static int result;
	static ResultSet rs; 
	public static void main(String[] args) 
	{
		Connection connection=MysqlDbconnection.getinstance();
		try
		{    
			Statement stmt=connection.createStatement();  
			rs=stmt.executeQuery("select * from employeetable");  
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getDouble(3)+" "+rs.getLong(4));  
			  
			}
			 result=stmt.executeUpdate("delete from employeetable where empid=101");
			System.out.println(result+" records affected");
			
			result=stmt.executeUpdate("update employeetable set empname='hellojava' where empid=100");
			System.out.println(result+"records updated");
			
			rs=stmt.executeQuery("select * from employeetable");
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getDouble(3)+" "+rs.getLong(4));  
			  
			}
			result=stmt.executeUpdate("insert into employeetable values(103,'hello',24000.0,2222222222)");
			System.out.println(result);
			
		}
		catch(Exception e)
		{ 
			System.out.println(e);
		}  
		  

	}

}

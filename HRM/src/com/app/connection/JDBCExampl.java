package com.app.connection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class JDBCExampl {
	Connection connection;
	Statement statement;
	PreparedStatement pstatement;
	ResultSet resultSet;
	JDBCExampl(){
		connection=MyConnection.getInstance();
	}
	public int insertData(Employee emp){
		String query="insert into Employee values(?,?,?)";
				int res=0;
				try{
					pstatement=connection.prepareStatement(query);
					pstatement.setInt(1,emp.getEmpid());
					pstatement.setString(2,emp.getEmpname());
					pstatement.setDouble(3,emp.getEmpsalary());
					res=pstatement.executeUpdate();
				}
				catch(Exception e){
					
				}
				return res;
		
	}
	public List<Employee> insert2list(){
		List<Employee> listofemp=new ArrayList<Employee>();
		String query="select *from Employee";
		try{
			pstatement=connection.prepareStatement(query);
			resultSet=pstatement.executeQuery();
			Employee emp=null;
			while(resultSet.next()){
				emp=new Employee();
				emp.setEmpid(resultSet.getInt(1));
				emp.setEmpname(resultSet.getString(2));
				emp.setEmpsalary(resultSet.getDouble(3));
				listofemp.add(emp);
			}	
			
		}
		catch(Exception e){
			
		}
		return listofemp;
		}
	     void displayall(){
	    	 List<Employee> emp1=insert2list();
	    	 Iterator<Employee> itr=emp1.iterator();
	    	 while(itr.hasNext()){
	    		 Employee emp2=(Employee)itr.next();
	    		 System.out.println(emp2.getEmpid()+"\t"+emp2.getEmpname()+"\t"+emp2.getEmpsalary()+"\t");
	    	 }
	    	 
	    	 
	     }
			
	}
		
	

	//program for getting the data from table()DB and display that data on console

package com.vtalent.narendar;

public class CollectionEmployee {
private int empId;
private String empName;
	public void setEmpId(int empID){
	
	this.empId=empID;
	}
	public void setEmpName(String empName){
		
		this.empName=empName;
		}
	
	public int getEmpId()
	{
		return empId;
	}
	public String getEmpName()
	{
		return empName;
	}

	@Override
	public String toString() {
		return "CollectionEmployee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	
}

package com.vtalent.saikrishna.exception;

public class AgeException extends Exception
{
	
	private static final long serialVersionUID = 1L;

	/*public AgeException(String s) 
	{
		super(s);
	}*/
	public String toString()
	{
		return "age sholud > 25";
	}
}

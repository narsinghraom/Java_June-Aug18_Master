package com.vtalent.karunya;

public class Catch {
	public static void main(String[] args){
		System.out.println("before try");
		try
		{
			System.out.println("inside try");
		}
		catch(Exception e)
		{
			System.out.println("inside catch");
		}
		finally
		{
			System.out.println("inside finally");
		}
		System.out.println("afterv finally");
	}

}

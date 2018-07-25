package com.vtalent.saikrishna;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader1 
{
	public static void main(String[] args) throws IOException
	{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter id");
	String i=br.readLine();
	//System.out.println(i);
	int i1=Integer.parseInt(i);
	System.out.println("id="+i1);
	}
}

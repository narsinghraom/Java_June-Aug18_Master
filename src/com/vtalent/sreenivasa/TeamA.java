package com.vtalent.sreenivasa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class TeamA 
{
	String teamName;
	int teamOvers;
	int teamScoresA,teamWicket=8;
	int runRate=6;
	void disp()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the overs played");
		teamOvers=s.nextInt();
		}
	public float runRates()
	{
		runRate=teamScoresA/teamOvers;
		return runRate;
	}
	public void disp1()
	{  
		teamScoresA=runRate*teamOvers;
	}
	/*public static void doSerializable() throws Exception
	{
		FileOutputStream fos=new FileOutputStream("f:/mahi2.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		TeamA a=new TeamA();
		oos.writeObject(a);
	}
	public static void deSerializable()throws Exception
	{

		FileInputStream fis=new FileInputStream("f:/mahi2.txt");
		int ch;
		while((ch=fis.read())!=-1)
		{
			System.out.print((char)ch);
		}
		
	}*/
}

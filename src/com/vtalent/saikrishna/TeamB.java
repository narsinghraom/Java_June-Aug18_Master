package com.vtalent.saikrishna;

import java.util.Scanner;

public class TeamB 
{
	static String teamName;
	static int teamScore;
	static int teamOvers;
	static double runrate;
	int count=0;
	Scanner s=new Scanner(System.in);
	void scoreCalculation2() throws Exception
	{
		System.out.println("enter the overs played by "+TeamB.teamName);
		TeamB.teamOvers=s.nextInt();
		if(count<2 && TeamB.teamOvers>50)
		{
			throw new ExceptionsOfODI().new OverException1();
		}
		else if(count==2 && TeamB.teamOvers>40)
		{
			throw new ExceptionsOfODI().new OverException2();
		}
		
		System.out.println("enter the runrate");
		TeamB.runrate=s.nextDouble();
		TeamB.teamScore=(int)(TeamB.teamOvers*TeamB.runrate);
		System.out.println(TeamB.teamName+ " scores "+TeamB.teamScore+"/"+wickets2()+" with current runrate  "+TeamB.runrate);
	}
	
	int wickets2()
	{
		if(count<=1)
		{
			if(TeamB.teamOvers<50)
			{
				return 10; 
			}
			else
			{
				if(TeamB.teamScore>=350)
				{
					return 6;
				}
				else if(TeamB.teamScore<350 && TeamB.teamScore>=300)
				{
					return 7;
				}
				else if(TeamB.teamScore<300 && TeamB.teamScore>=250)
				{
					return 8;
				}
				else
				{
					return 9;
				}
			}
		}
		else
		{
			if(TeamB.teamOvers<40)
			{
				return 10;
			}
			else
			{
					if(TeamB.teamScore>=350)
					{
						return 6;
					}
					else if(TeamB.teamScore<350 && TeamB.teamScore>=300)
					{
						return 7;
					}
					else if(TeamB.teamScore<300 && TeamB.teamScore>=250)
					{
						return 8;
					}
					else
					{
						return 9;
					}
				}
		}
	}
}

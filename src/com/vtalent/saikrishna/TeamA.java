package com.vtalent.saikrishna;

import java.util.Scanner;

public class TeamA 
{
	String teamName;
	int teamScore;
	int teamOvers;
	double runRate;
	int count=0;
	Scanner s=new Scanner(System.in);
	void weather() throws Exception
	{
		System.out.println("if it is rainy or not?(yes/no)");
		String s1=s.next();
		if(s1.equals("yes"))
		{
			count++;
			if(count==3)
			{
				throw new ExceptionsOfODI().new WeatherException();
			}
			weather();
		}
		else
		{
			teamName();
		}
	}
	void teamName()
	{
		System.out.println("pls enter TeamA name");
		teamName=s.next();
		System.out.println("pls enter TeamB name");
		TeamB.teamName=s.next();
		System.out.println("welcome to ODI "+teamName+" v/s "+TeamB.teamName);
	}
	
	void scoreCalculation() throws Exception
	{
		System.out.println("enter the overs played by "+teamName);
		teamOvers=s.nextInt();
		if(count<2 && teamOvers>50)
		{
			throw new ExceptionsOfODI().new OverException1();
		}
		else if(count==2 && teamOvers>40)
		{
			throw new ExceptionsOfODI().new OverException2();
		}
		
		System.out.println("enter the runrate");
		runRate=s.nextDouble();
		teamScore=(int)(teamOvers*runRate);
		System.out.println(teamName +" scores "+teamScore+"/"+wickets1()+" with current runrate" +runRate );
	}
	int wickets1()
	{
	if(count<=1)
	{
		if(teamOvers<50)
		{
			return 10; 
		}
		else
		{
			if(teamScore>=350)
			{
				return 6;
			}
			else if(teamScore<350 && teamScore>=300)
			{
				return 7;
			}
			else if(teamScore<300 && teamScore>=250)
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
		if(teamOvers<40)
		{
			return 10;
		}
		else
		{
				if(teamScore>=350)
				{
					return 6;
				}
				else if(teamScore<350 && teamScore>=300)
				{
					return 7;
				}
				else if(teamScore<300 && teamScore>=250)
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
	//========================================================
	
	/*void scoreCalculation2() throws Exception
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
	}*/
	void win()
	{
		if(teamScore>TeamB.teamScore)
		{
			System.out.println(teamName+ " win by"+(teamScore-TeamB.teamScore)+ " runs ");
		}
		else
		{
			System.out.println(TeamB.teamName+ " win by"+(TeamB.teamScore-teamScore)+ " runs");
		}
	}
}

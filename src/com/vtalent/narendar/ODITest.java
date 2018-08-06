package com.vtalent.narendar;
import java.util.*;
public class ODITest {
	
	public static void main(String[] args) throws Exception
	{
		TeamA a=new TeamA();
		a.teamName();
		TeamB b=new TeamB();
	    b.teamName();
		
System.out.println("Welcome to ODI"+" "+a.teamNameA+" "+"vs"+" "+b.teamNameB);
a.score();
b.score();

 if(a.teamScoreA>b.teamScoreB)
 {
	 int i=a.teamScoreA-b.teamScoreB;
	 System.out.println(a.teamNameA+" "+"won ");
 }
 
 if(a.teamScoreA<b.teamScoreB)
 {
	 System.out.println(b.teamNameB+" "+"won");
 }
 
 }
}
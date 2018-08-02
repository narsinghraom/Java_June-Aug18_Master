package com.vtalent.narendar;
import java.util.*;
public class ODITest {
	
	public static void main(String[] args)
	{
		TeamA a=new TeamA();
		a.teamName();
		TeamB b=new TeamB();
	    b.teamName();
		
System.out.println("Welcome to ODI"+" "+a.teamNameA+" "+"vs"+" "+b.teamNameB);
a.score();
b.score();
}
}
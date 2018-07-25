package com.vtalent.jyothsna;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedExample {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    System.out.println("enter the id");
   String s= br.readLine();
   int id=Integer.parseInt(s);
   System.out.println("enter the name");
  String name= br.readLine();
  System.out.println("enter the salary");
  String ss=br.readLine();
  double salary=Double.parseDouble(ss);
  System.out.println("the id is:"+id+"  "+"name is="+name+"  "+"salary="+salary);
	}

}

package com.vtalent.sahithi;
import java.io.*;
public class BufferExampl {
	 public static void main(String args[])
             throws IOException
{
   BufferedReader br = new BufferedReader(new  InputStreamReader(System.in));
   System.out.println("Enter an integer");
   String s1=br.readLine();
   int a = Integer.parseInt(s1);
   System.out.println("Enter a String");
   String b = br.readLine();
   System.out.printf("You have entered: " + a + " and name as " + b);
                    
}

}

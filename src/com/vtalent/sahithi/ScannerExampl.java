package com.vtalent.sahithi;
import java.util.Scanner;
public class ScannerExampl {
	 public static void main(String args[])
     {
         Scanner scn = new Scanner(System.in);
         System.out.println("Enter an integer");
         int a = scn.nextInt();
         System.out.println("Enter a String");
         scn.nextLine();
         String b = scn.next();
//         String b = scn.nextLine();
         System.out.printf("You have entered: " + a + " " + "and name as " + b);
     }
                

}

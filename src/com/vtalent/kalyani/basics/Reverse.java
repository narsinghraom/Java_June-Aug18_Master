package com.vtalent.kalyani.basics;

import java.util.Arrays;

public class Reverse {

		public static void main(String[] args) {
			 int[] my = {
			            1, 5, 9, 6, 3, 
			            8, 5, 4, 2, 5, 
			            6, 5, 7, 6};
			  System.out.println("Original array : "+Arrays.toString(my)); 
			  int a=my.length;
			  System.out.println(a);
			   for(int i = 0; i < a / 2; i++)
			  {
			    int temp = my[i];
			    my[i] = my[a- i - 1];
			    my[a - i - 1] = temp;
			  }
			    System.out.println("Reverse array : "+Arrays.toString(my));
			 }
			


	}



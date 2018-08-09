package com.vtalent.sahithi;
import java.util.Scanner;
public class DialPad {
	public static void main(String[] args) {
		String[] s={" "," ","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
		Scanner s1=new Scanner(System.in);
		System.out.println("enter any string");
		String s2=s1.nextLine();//sahithi
		for(int i=0;i<=s2.length()-1;i++){
			char ch=s2.charAt(i);//s
			String s4=Character.toString(ch);//sa...//CHAR into STRING
			for(int j=2;j<=s.length-1;j++){
				String s3=s[j];
				
				if(s3.contains(s4)){
				System.out.print(j);
				
			}
		}
			
	}

}
}

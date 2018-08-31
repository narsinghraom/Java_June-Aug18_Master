package com.vtalent.arun.basics;

public class StringExample {

	
	public static void main(String[] args) {
		String s1= new String("ARUN");
	     String s2="Kumar";
	     String s3;
	     String s4= new String("  Software Engineer");
	     String s5=new String("ARUN");
int len = s2.length();
System.out.println(len);
char ch = s1.charAt(2);
System.out.println(ch);
s3= s1.concat(s2);
System.out.println("this is changed by ashwini");
System.out.println("....................");
System.out.println(s3);
System.out.println(s1.toLowerCase());
System.out.println(s2.toUpperCase());
System.out.println("String s1 equlas s4 is "+s1.equals(s4));
System.out.println("String s1 equals s5 "+s1.equals(s5));
System.out.println("before trim :"+s4);
System.out.println("after trimming:"+s4.trim());
System.out.println("Substring of s4: "+s4.substring(8));
System.out.println("Substring of s4: "+s4.substring(5,11));
System.out.println("String s4 contains Engineer: "+s4.contains("Engineer"));
System.out.println("t ane aksharam unna chotu  : "+s4.indexOf('t'));

	}

}



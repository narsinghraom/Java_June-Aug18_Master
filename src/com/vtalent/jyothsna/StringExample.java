package com.vtalent.jyothsna;

public class StringExample {
	public static void main(String args[]) {
		String s1=new String("Abc");
		System.out.println(s1);
		String s2="Abc";
		String s3="Abc";
		String s4=new String("Abc");
		String s5=new String("xyz");
		String s6=new String("XyZ");
System.out.println(s1.equals(s3));//true
System.out.println(s2==s4);//false
System.out.println(s2==s3);//true
System.out.println(s4.equals(s5));//false
System.out.println(s5.equalsIgnoreCase(s6));//true
System.out.println(s5.equals(s6));//false
s1=new String("def");
System.out.println(s1+s2);
 String s7=s3+s5;
 System.out.println(s7);
 System.out.println(s2=s7);
 System.out.println(s7=s2);
// System.out.println(s1.charAt(0));
 for(int i=0;i<=s1.length()-1;i++) {
	 System.out.println(s1.charAt(i));
	 
 }
 String s8="jyothsna".substring(2,6);
 System.out.println("output of substring="+s8);//oths
 String a1="sowmya".substring(3,5);
 System.out.println(a1);//my
 String b1=new String("narender").substring(1,3);
 System.out.println(b1);
 System.out.println(s1.compareTo(s2));
 int i=s1.compareTo(s2);
 System.out.println(i);
 String a2="jyo";
 String a3="thsna";
 System.out.println(a2.concat(a3));//jyothsna
 
		String s="jyothsna";
		String ss="sreenu";
		System.out.println(s.compareTo(ss));//-9
		System.out.println(s.contains("jyo"));
		boolean b=s.contains("sna");
		System.out.println("return value for boolean is ="+b);
		System.out.println(s.charAt(6));
		
	
	}
}
	



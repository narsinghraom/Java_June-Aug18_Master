package com.vtalent.nagaraju.basics;

public class TestString {
	
	public static String concatWithString()    {  
        String t = "Java";  
        for (int i=0; i<10000; i++){  
            t = t + "Tpoint";  
        }  
        return t;  
    } 
	public static String concatWithStringBuffer(){  
        StringBuffer sb = new StringBuffer("Java");  
        for (int i=0; i<10000; i++){  
            sb.append("Tpoint");  
        }  
        return sb.toString();  
    } 
    public static void main(String[] args) {
    	 //String s=50+30+"Sachin"+40+40+"hello"+10+10;  
    	// System.out.println(s);//80Sachin4040 
//    	 String s="SachinTendulkar";  
//    	   System.out.println(s.substring(6));//Tendulkar  
//    	   System.out.println(s.substring(0,6));//Sachin 
//    	   StringBuffer sb=new StringBuffer("HelloWorld");  
//    	   sb.replace(1,5,"Java");  
//    	   System.out.println(sb);//prints HJavalo  
//    	StringBuffer sb=new StringBuffer();  
//    	System.out.println(sb.capacity());//default 16  
//    	sb.append("Hello");  
//    	System.out.println(sb.capacity());//now 16  
//    	sb.append("java is my favourite language");  
//    	System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
//    	StringBuffer sb=new StringBuffer();  
//    	System.out.println(sb.capacity());//default 16  
//    	sb.append("Hello");  
//    	System.out.println(sb.capacity());//now 16  
//    	sb.append("java is my favourite language");  
//    	System.out.println(sb.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
//    	sb.ensureCapacity(10);//now no change  
//    	System.out.println(sb.capacity());//now 34  
//    	sb.ensureCapacity(50);//now (34*2)+2  
//    	System.out.println(sb.capacity());//now 70 
    	
    	long startTime = System.currentTimeMillis();  
        concatWithString();  
        System.out.println("Time taken by Concating with String: "+(System.currentTimeMillis()-startTime)+"ms");  
        startTime = System.currentTimeMillis();  
        concatWithStringBuffer();  
        System.out.println("Time taken by Concating with  StringBuffer: "+(System.currentTimeMillis()-startTime)+"ms");  

         
	}
}

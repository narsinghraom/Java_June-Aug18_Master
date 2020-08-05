package com.vtalent.karunya.innerclass;

public class OuterEx1 {
       private int i=10;
       public void function(int i){
    	   System.out.println(this.i+i);
    	  
       }
       static class InnerEx{
    	   float f=1.5f;
    	   public static void function(float f)
    	   {
    		   OuterEx1 o=new OuterEx1();
    		   o.function((int)f);
    		   System.out.println(f+f);
    	   }
       }
       public static void main(String[] args){
    	   OuterEx1.InnerEx ie=new OuterEx1.InnerEx();
    	   ie.function(2.5f);
    	   
       }
       }

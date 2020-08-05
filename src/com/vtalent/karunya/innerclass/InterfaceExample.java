package com.vtalent.karunya.innerclass;

public class InterfaceExample {
	public void function(int i){
	}

    class Test{
    	
    }
	   public static void main(String[] arg){
		   InterfaceExample ie=new InterfaceExample(){
			   public void function(int i){
				   System.out.print(i);
			   }
		   };
	   ie.function(5);
   }
}
   

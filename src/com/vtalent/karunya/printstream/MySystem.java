package com.vtalent.karunya.printstream;

public final class MySystem {
       private MySystem(){
       }
    	   static MyPrintStream out=new MyPrintStream(new OutputStream(){
    		  public void console()
    		  {
    			  
    		  }
    	   });
}
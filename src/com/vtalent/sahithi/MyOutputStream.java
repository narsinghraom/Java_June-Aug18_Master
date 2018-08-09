package com.vtalent.sahithi;

abstract class MyOutputStream {
	public abstract void console();
}
         final class MySystem{
        	 private MySystem(){
         }
     static MyPrintStream out=new MyPrintStream(new MyOutputStream(){
    	 public void console();
     } 
     });
}

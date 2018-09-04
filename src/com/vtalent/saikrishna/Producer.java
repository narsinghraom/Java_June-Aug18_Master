package com.vtalent.saikrishna;

public class Producer extends Thread
{
	 private CubbyHole cubbyhole;
	   private int number;//1
	   public Producer(CubbyHole c, int number) {
	      cubbyhole = c;
	      this.number = number;
	   } 
	   public void run() {
	      for (int i = 0; i < 10; i++) {
	         cubbyhole.put(i);//0,1
	         System.out.println("Producer #" + this.number + " put: " + i);
	         try {
	            sleep(3000);
	         } catch (InterruptedException e) { }
	      } 
	   }
}

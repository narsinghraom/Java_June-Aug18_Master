package com.vtalent.nagaraju.basics;
/* non-static class */
public class Outer {
  private int i;
  public void function(int i){
	  i++;
	  this.i=i;
  }
  class Inner{
	  int i;
	  public void function(){
		  Outer.this.function(i);
	  }
  }
  public static void main(String args[]){
	  
	  Outer outer=new Outer();
	  /* //Outer.Inner inner=outer.new Inner();
	  Inner inner=outer.new Inner();*/
	  Outer.Inner inner=new Outer().new Inner();//problem in using this line not able to get the i value has expected i=6
	  inner.i=5;
	  inner.function();
	  System.out.println(outer.i);
	  
  }
}

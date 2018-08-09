package com.vtalent.narendar;

interface Example
{
	public void function(int i);
}
public class Anonymous {
	public static void main(String[] args)
	{
		Example e=new Example()
				{public void function(int i){
					System.out.println(i);
				}
				};
	
		e.function(5);
	}

}

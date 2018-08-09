package com.vtalent.karunya;

public class Try {
	public static void main(String[] args){
		System.out.println("before try");
		{
			try
			{
				System.out.println("inside try,before exception");
		int i=10;
		int j=0;
		float f=(i/j);
				System.out.println("inside try,after exception");
	}
				catch(Exception e){
				System.out.println("inside catch");	
				}
				finally
				{
					System.out.println("inside finally");
				}
				System.out.println("after finslly");				

}
}
}
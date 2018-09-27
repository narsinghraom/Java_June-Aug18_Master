package com.vtalent.kalyani.basics;
public class Anonymous {

	public static void main(String[] args) {
		Popcorn p=new Popcorn()//this is also an inner class for class test which has no name 
		{
		//System.out.println(p.getClass().getName());
		
			public void taste()
			{
				System.out.println("sweet");
			}
			
		};
	p.taste();
	System.out.println(p.getClass().getName());
	
	
	Popcorn p1=new Popcorn()//this is also an inner class for class test which has no name 
	{
	//System.out.println(p.getClass().getName());
	
		public void taste()
		{
			System.out.println("spicy");
		}
		
	
};
p1.taste();
System.out.println(p1.getClass().getName());

}
}
		
package com.vtalent.ashwini.basicjava;


public class Test3 
{
		static Test3 obj=new Test3();
		static 
		{
			System.out.println("this is in static blocks");
			System.out.println(Test3.obj);
			System.out.println(obj);
			Test3.obj.fun();
			System.out.println("this is for obj2");
			System.out.println(obj1);//it should give static default value null right .....why it is showing "cannot reference a field before it is defined	
		}
		void fun()
		{
			System.out.println("this is sooo fun of trying");
		}
		
		static Test3 obj1=new Test3();
		
		public static void main(String[] args)
		{
			System.out.println("in main method");
			System.out.println(Test3.obj);
			System.out.println(obj);
			Test3.obj.fun();
			System.out.println("this is for obj1");
			System.out.println(obj1);	
			
		}

	}


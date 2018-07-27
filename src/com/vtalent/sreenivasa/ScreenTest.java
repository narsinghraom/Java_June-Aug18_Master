package com.vtalent.sreenivasa;

public class ScreenTest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int i,j,k;
		for(i=0;i<3;i++)
		{
			for(j=1;j<4;j++)
			{
				for(k=2;k<5;k++)
				{
					if((i==j)&&(j==k))
						System.out.println(i);//2
				}
			}
		}
		String str="example";
		String s1=str.substring(2,4);
		System.out.println("the remaining string is="+s1);//am
		
		String text="abc";
		text =text+text;
		System.out.println(text);//abcabc
		  
		char ch;
		String test2="abcd";
		String test1=new String("abcd");
		if(test1.equals(test2))
		{
			if(test1==test2)
				ch=test1.charAt(0);
			else
				ch=test1.charAt(1);
		}
			else
			{
				if(test1==test2)
					ch=test1.charAt(2);
				else
					ch=test1.charAt(3);
				
			}
		
			System.out.println(ch);//b
			
			/*Integer intobj=Integer.valueOf(args[args.length-1]);
			int i1=intobj.intValue();
			if(args.length>1)
				System.out.println(i1);
			if(args.length>0)
				System.out.println(i1-1);
			else
				System.out.println(i1-2);*/
			
			int i2=0;
			boolean t=true;
			boolean f=false,b;
			b=(t|((i2++)==0));
			b=(f|((i2+=2)>0));
			System.out.println(i2);//3
			}

}

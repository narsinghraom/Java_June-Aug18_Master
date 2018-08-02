package com.vtalent.narendar;

 public class MemberInner {

    private int i=10;
    public void function(int i)
    		{
    		System.out.println(this.i+i);
    		}
 
	public class InnerExample {
		 float f=1.5f;
			public void function(float f)
				{
					//function((int)f);
				MemberInner outer=new MemberInner();
				outer.function((int)f);
					System.out.println(this.f+f);
	}
	
	}
public static void main(String[] args)
{
	MemberInner outer=new MemberInner();
	MemberInner.InnerExample ie=outer.new InnerExample();
	
	ie.function(2.5f);
	}
	
}
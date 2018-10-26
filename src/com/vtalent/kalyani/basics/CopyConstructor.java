package kalyani.basics;

public class CopyConstructor {
	int i, j;
	
	CopyConstructor()
	{
		this(2,3);
		i=5;
		j=10;
		
	}
	CopyConstructor(int i)
	{
		this.i=this.i+i;
		j=j+i;
		
	}
	CopyConstructor(int i,int j)
	{
		this(i+j);
		this.i=this.i+i;
		this.j=this.j+j;
	}

	public static void main(String[] args)
	{
		CopyConstructor cc=new CopyConstructor();
		System.out.println(cc.i);
		System.out.println(cc.j);
		
	}

}

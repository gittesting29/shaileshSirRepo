package demo;

public class ThisKeywordAndStatement 
{
	static int i=23;
	int j=45;
	ThisKeywordAndStatement()
	{
		System.out.println("Value of i= "+ThisKeywordAndStatement.i);
		System.out.println("Value of j= "+this.j);
	}
	ThisKeywordAndStatement(int i)
	{
		this();
		System.out.println("Inside int parameter constuctor....");
	}
	ThisKeywordAndStatement(double d)
	{
		this(34);
		 System.out.println("Inside double parameter constructor......");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordAndStatement t=new ThisKeywordAndStatement(56.78);
	}

}

package Pkg;

public class Maths
{
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("result of sum  " +c);
		return c;

}
	public int sub(int a1,int b1)
	{
		int c1;
		c1=a1-b1;
		System.out.println("result of sub  " +c1);
		return c1;

}
	public int multi(int a3,int b3)
	{
		int c3;
		c3=a3*b3;
		System.out.println("result of multi " +c3);
		return c3;

}
	public void div(int a4,int b4)
	{
		int c4;
		c4=a4/b4;
		System.out.println("result of div   " +c4);
		

}
	public static void main(String[] args) {
		Maths obj=new Maths();
		int sumresult=obj.sum(10, 2);
		int sumresult1=obj.sum(sumresult, 2);
		int sumresult2=obj.sub(sumresult1, 2);
	    int sumresult3=obj.multi(sumresult2, 2);		
	    obj.div(sumresult3,2);
		
		
	}
		
		
	}
		
	
	

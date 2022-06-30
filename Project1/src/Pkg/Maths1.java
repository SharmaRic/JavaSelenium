package Pkg;

public class Maths1 {
	
	public int div(int a,int b)
	{
		int c;
		c=a/b;
		System.out.println("result of div:   " +c);
		return c;
	}
	
	public int sub(int a1,int b1)
	{
		int c1;
		c1=a1-b1;
		System.out.println("result of sub:  " +c1);
		return c1;
		}
	public int sum(int a2,int b2)
	{
		int c2;
		c2=a2+b2;
		System.out.println("result of sum:  " +c2);
		return c2;
	}
	public void multi(int a3,int b3)
	{
		int c3;
		c3=a3*b3;
		System.out.println("result of multi " +c3);
		
	}
	public static void main(String[] args) {
		Maths1 obj=new Maths1();
		int divresult =obj.div(10,2);
		int subresult =obj.sub(divresult, 2);
		int againsubresult =obj.sub(subresult,2);
		int sumresult =obj.sum(againsubresult, 2);
		obj.multi(sumresult, 2);
		
	}
}

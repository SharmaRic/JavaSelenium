package Pkg;

public class Construct {
	
	public Construct()
	{
		this(1,2,3);
		System.out.println("Default constructor");
	}
	public Construct(int a)
	{
		System.out.println("One parameterized constructor");
	}
	public Construct(int a, int b)
	{
		this(1);
		System.out.println("Two parameterized constructor");
	}
	public Construct(int a, int b, int c)
	{
		
		System.out.println("Three parameterized constructor");
	}
	public Construct(int a, int b, int c, int d)
	{
		this(2,3);
		System.out.println("four parameterized constructor");
	}
	public static void main(String[] args) {
		Construct obj=new Construct();
		Construct obj1=new Construct(2,3,4,5);
		}
}

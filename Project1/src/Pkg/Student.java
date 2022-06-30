package Pkg;

public class Student
{
	int age;
	int rollNo;
	public void display1()
	{
		System.out.println("Welcome to All");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		
		Student s=new Student();	
		s.display1();
		s.display2();
		s.age=2;
		System.out.println(s.age);
		s.rollNo=1;
		System.out.println(s.rollNo);
	}
	
}

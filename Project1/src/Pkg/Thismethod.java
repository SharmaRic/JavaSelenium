package Pkg;

public class Thismethod {
	
	public void m1(){
		System.out.println("Default Method");
		this.m2();
		
	}
	public void m2(){
		System.out.println("One parameterized Method");
		this.m3();
		
	}
	public void m3(){
		System.out.println("Two parameterized Method");
		this.m5();
		
	}
	public void m4(){
		System.out.println("Three parameterized Method");
		this.m1();
	}
	public void m5(){
		System.out.println("four parameterized Method");
	}
	public static void main(String[] args) {
		Thismethod obj=new Thismethod();
		obj.m4();
	}
	
}

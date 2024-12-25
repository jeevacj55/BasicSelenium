package basic_JavaPrograms;

abstract class A{
	
	abstract void m1();
	
	void m2()
	{
		System.out.println("concrete method");
	}
	
}

class B extends A {
	void m1(){
		
		System.out.println("implementation of abstract method m1");
	}
	
}


public class AbstractDemo {

	public static void main(String[] args)
	{
		B b = new B();
		b.m1();
		b.m2();

	}

}

package basic_JavaPrograms;

class Parent{
	public void m1() {
		System.out.println("from parent class m1()");
	}
}
class Child extends Parent{
	@Override
	public void m1() {
		System.out.println("from child class m1()");
	}
}

public class MethodOverriding_Polymorphism {

	public static void main(String[] args) {
		
		Parent p=new Parent();
		p.m1();
		
		Child c=new Child();
		c.m1();
		
		Parent p1=new Child();//upcasting
		p1.m1();
		
		Child ch = (Child)p1;//downcasting
		ch.m1();

	}

}

package basic_JavaPrograms;

public class MethodOverloading_Polymorphism {

	public static void main(String[] args) {
		
		MethodOverloading_Polymorphism m1 = new MethodOverloading_Polymorphism();
		m1.test();
		m1.test(1,2);
		m1.test(1,2,3);

	}
public void test(){
	System.out.println("from no args");
	
}



public void test(int i, int j, int k) {
	System.out.println("from 3 args");
}

public void test(int i, int j) {
	System.out.println("from 2 args");
}
}

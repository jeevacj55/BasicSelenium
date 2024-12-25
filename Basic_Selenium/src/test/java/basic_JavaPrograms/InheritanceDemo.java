package basic_JavaPrograms;

class Employee {
	int salary=50000;
}

class Engineer extends Employee{
	int benefits=10000;
}

public class InheritanceDemo {

	public static void main(String[] args) {
		
		Engineer e1 = new Engineer();
		System.out.println("Salary:"+ e1.salary);
		System.out.println("benefits:"+ e1.benefits);
		

	}

}

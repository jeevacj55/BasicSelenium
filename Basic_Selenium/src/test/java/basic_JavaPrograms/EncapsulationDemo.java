package basic_JavaPrograms;

public class EncapsulationDemo {
private String name;
private int age;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name=name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age=age;
}
	public static void main(String[] args) {
		EncapsulationDemo person = new EncapsulationDemo();
		person.setName("jeeva");
		person.setAge(26);
		
		System.out.println("Name:"+person.getName());
		System.out.println("age:"+person.getAge());

	}

}

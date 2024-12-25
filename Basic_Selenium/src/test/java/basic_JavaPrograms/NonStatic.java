package basic_JavaPrograms;

public class NonStatic {

	public String student;
	public int i;
	
	//constructor
	public NonStatic()
	{
		//initializing non static variable
		this.student = "jeeva";
		this.i = 10;
	}
	
	
	public static void main(String[] args) {
		
		//object creation
		NonStatic name= new NonStatic();
		
		System.out.println("student name is : "+name.student);
		System.out.println("default value of i is : "+name.i);

	}

}

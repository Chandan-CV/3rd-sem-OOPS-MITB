package employee;

public class Employee {
	String name;
	int age;
	String Designation;
	int salary;
	
	Employee(){
		this.name = "Sample Name";
		this.Designation="Sample Position";
		this.age =300;
		this.salary =20;
	}
	
	Employee(String name, int age, String Designation, int salary){
		this.name = name;
		this.age = age;
		this.Designation = Designation;
		this.salary = salary;
	}
	
	void display() {
		System.out.println("the values of the employee is as follows");
		System.out.println("name:"+ this.name);
		System.out.println("age: "+ this.age);
		System.out.println("Designation: "+ this.Designation);
		System.out.println("Salary: "+ this.salary);
		System.out.println("done printing all the values of the employee");
	}
	
	
	
}

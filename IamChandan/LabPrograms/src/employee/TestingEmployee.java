package employee;

public class TestingEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee a = new Employee();
		Employee b = new Employee("Chandan", 20, "SWE 1", 4500000);
		System.out.println("values of the employee of default constructor");
		a.display();
		System.out.println();
		System.out.println("values of the employee of parameterized");
		b.display();
		
	}

}

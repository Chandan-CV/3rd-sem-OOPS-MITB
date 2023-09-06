package stringLab;

public class Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		
		e.formatEmployeeName("CHANDAN C V");
		System.out.println(e.name);
		System.out.println("email: "+e.GenerateEmployeeEmail());
	}

}

package student;

public class TestingStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		STUDENT a = new STUDENT();
		STUDENT b = new STUDENT("Chandan",20,'C',2);
		
		
		System.out.println("the details for the student initialized with the default constructor");
		System.out.println(a.name);
		System.out.println(a.age);
		System.out.println(a.year);
		System.out.println(a.section);
		b.addMarks(70,96,81,74,70);
		
		System.out.println("average: "+ b.average());
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("the details for the student initialized with the parameterized constructor");
		System.out.println(b.name);
		System.out.println(b.age);
		System.out.println(b.year);
		System.out.println(b.section);
		
		b.addMarks(100,90,80,90,70);
		
		System.out.println("average: "+ b.average());
	}

}

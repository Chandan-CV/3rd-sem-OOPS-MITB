package student;

public class STUDENT {
	String name;
	int age;
	char section;
	int year;
	int[] marks = new int[5];
	STUDENT(){
		this.name = "John Doe";
		this.age = 18;
		this.section = 'C';
		this.year = 1;
	}
	
	STUDENT(String name, int age, char section, int year){
		this.name = name;
		this.age = age;
		this.section= section;
		this.year = year;
	}
	
	void addMarks(int ...marks) {
		System.out.println("adding all these marks to the student's marks");
		this.marks = marks;
		System.out.println("added all the marks");
	}
	
	int average() {
		int sum =0;
		for(int i =0; i< marks.length; i++) {
			sum += marks[i];
		}
		return sum/5;
	}
}

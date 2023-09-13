package stringLab;


public class School {
	void sortWithCGPA(Student ...Students) {
		for(int i=0; i<Students.length;i++) {
			for(int j=0; j<Students.length;j++) {
				if(Students[i].cpga>Students[j].cpga) {
					Student temp = Students[i];
					Students[i] = Students[j];
					Students[j]= temp;
				}
			}
		}
		for(Student Student:Students) {
			System.out.println(Student.name+"  "+Student.cpga);
		}
	}
	Student character(char c, Student ...Students) {
		for (Student Student:Students) {
			if(Student.name.charAt(0)==c) {
				return Student;
			}
		}
		System.out.println("did not find the name starting with this character");
		return new Student();
	}
	
	void findSubstring(String s, Student ...students) {
		for(Student student:students) {
			for(int i=0; i<student.name.length();i++) {
				if(student.name.charAt(i)== s.charAt(0)) {
					if(student.name.substring(i,i+s.length()).equals(s)) {
						System.out.println(student.name);
						break;
					}
				}
			}
		}
	}

	void changeNames(Student ...students) {
		String currentString="";
		for(Student student:students) {
			currentString ="";
			String[] names = student.name.split(" ");
			for(int i =0 ;i<names.length;i++) {
				if(i==names.length-1) {
					currentString = currentString + names[i];
				}else {
					currentString += names[i].charAt(0)+". ";
				}
			}
			student.name = currentString;
		}
		for(Student student:students) {
			System.out.println(student.name);
		}
	}
}

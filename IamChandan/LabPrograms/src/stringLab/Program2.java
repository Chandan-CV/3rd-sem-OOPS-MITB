package stringLab;

public class Program2 {
	
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

Student[] sort(Student ...students) {
	Student temp;	
	for(int i =0;i<students.length;i++) {
			for(int j=0;j<students.length;j++) {
				if(students[i].name.compareTo(students[j].name)<0) {
						temp = students[i];
						students[i] = students[j];
						students[j] = temp;
				}
			}
		}
return students;
}

public static void main(String[] args) {
	Student a = new Student("Chandan C V");
	Student b = new Student("Astitva Agarwal");
	Student c = new Student("Leeza George T");
	Student d = new Student("Aashi Varma");
	Student e = new Student("Kaustubh Thakar");
	System.out.println(a.extractInitials());
	System.out.println(a.removeWhiteSpaces());
	Program2 p = new Program2();
	p.findSubstring("ar", a,b,c,d,e);
	System.out.println("/////");
	System.out.println();
	System.out.println("/////");
	for(Student student:p.sort(a,b,c,d,e)) {
		System.out.println(student.name);
	}

}


}

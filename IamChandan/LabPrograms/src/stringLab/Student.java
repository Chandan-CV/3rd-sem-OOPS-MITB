package stringLab;

import java.util.GregorianCalendar;

public class Student {
	static int number =1;
	int regNo;
	String name;
	GregorianCalendar date;
	short sem;
	float gpa;
	float cpga;
	Student(){};
	Student(String name){
	this.name = name;
}
Student(String name,GregorianCalendar date, short sem){
	this.name = name;
	this.date = date;
	this.sem = sem;
	String tempDate = date.getTime().toString();
	int year = Integer.parseInt(tempDate.substring(tempDate.length()-2,tempDate.length()));
	this.regNo = (int) (year*Math.pow(10, (int)Math.log(number)+1))+ number;
	}


String extractInitials() {
	String[] names = this.name.split(" ");
	String initials ="";
	for(String n:names) {
		initials = initials+n.substring(0,1).toUpperCase();
	}
	return initials;
}
String removeWhiteSpaces() {
return name.replaceAll(" ", "");
}
void addMarks(float marks) {
	System.out.println("adding all these marks to the student's marks");
	this.cpga = marks;
	System.out.println("added all the marks");
}
}

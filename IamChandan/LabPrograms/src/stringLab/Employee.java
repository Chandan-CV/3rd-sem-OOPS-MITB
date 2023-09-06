package stringLab;

public class Employee {
String name;

void formatEmployeeName(String name) {
	name =name.toLowerCase();
	String[]  names = name.split(" ");
	String finalName="";
	for(String n:names) {
		finalName= finalName + n.substring(0,1).toUpperCase() + n.substring(1)+" ";
	}
	this.name=finalName;
	}

String GenerateEmployeeEmail() {
	String email =name.substring(0,1).toLowerCase();
	String[] names = name.split(" ");

	String rest ="";
	for(int i =1 ;i<names.length;i++) {
		rest = rest + names[i].toLowerCase(); 
	}
	
	
	return email + rest +"@example.com";
}

}

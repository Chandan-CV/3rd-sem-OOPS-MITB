package stringLab;

import java.util.GregorianCalendar;

public class Program5 {
	public static void main(String[] args) {
//		String name,GregorianCalendar date, short sem
		GregorianCalendar g = new GregorianCalendar();
		Student a = new Student("Chandan Venkatesh",g,(short)3);
		Student b = new Student("Kaustubh Thakar",g,(short)3);
		Student c = new Student("Leeza George",g,(short)3);
		Student d = new Student("Astitva Agarwal",g,(short)3);
		Student e = new Student("Aashi Varma",g,(short)3);
		Student f = new Student("Siddhant Ghosh",g,(short)3);
		School s = new School();
		System.out.println("/////////// printing names of students whose names start with a char////////");
		System.out.println(s.character('K', a,b,c,d,e,f).name);
		
		System.out.println("/////////// Printing students with particular substring////////");
		s.findSubstring("ar", a,b,c,d,e,f);
		
		
		System.out.println("/////////// Changing names////////");
		s.changeNames(a,b,c,d,e,f);
		
		
	}
}

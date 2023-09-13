package stringLab;

public class Program6 {
	public static void main(String[] args) {
		int number =  12345678;
//		String NewNumber ="";
//		for(int i=number.length()-1; i>=0;i--) {
//			if(i%3==0 && i!=0) {
//				System.out.println(i);
//				NewNumber = number.charAt(i)+" "+NewNumber;
//			}
//			else {
//				NewNumber = number.charAt(i)+NewNumber;
//			}
//		}
		System.out.println(String.format("%,d", number));
	}
}

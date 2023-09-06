package staticcounter;

public class StaticCounter {
	static int counter =0;
	
	StaticCounter(){
		counter++;
	}
	static void displayCounter() {
		System.out.println("counter val: "+ counter);
	}
}

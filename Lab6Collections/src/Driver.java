
public class Driver {
	
	public static void main(String[] args) {
	
		NameManager attendance = new NameManager();
	
		attendance.addName("Mo (not jersey mo)");
		attendance.addName("Ibra");
		attendance.addName("Alix Yu");
		attendance.addName("That one blonde guy");
		attendance.addName("Ben (drunk)");
		attendance.addName("Eva S Kaufman");
		attendance.addName("Jason");
		
		attendance.printNames();
		
		attendance.removeLongNames();
		
		attendance.printNames();
		
	}
}

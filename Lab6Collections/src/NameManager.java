import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NameManager {
	List<String> names = new ArrayList<String>();
	
	void addName(String name) {
		names.add(name);
	}
	
	void printNames() {
		for(String name : names) {
			System.out.println("The next name is: " + name);
		}
	}
	
	void removeLongNames() {
		Iterator<String> iter = names.iterator();
		while(iter.hasNext()) {
			String name = iter.next();
			if(name.length() > 15) {
				iter.remove();
			}
		}
		System.out.println("\nAll long names removed.\n");
	}
}

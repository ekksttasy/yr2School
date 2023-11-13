/**
 * Parent class to all subject classes. 
 * 
 * @author evask
 */
public abstract class Subject implements Delivery{
	protected String description;
	protected String name;
	protected int credit;
	
	public abstract int getCredit();
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	Subject(String name, String description) {
		
	}
}

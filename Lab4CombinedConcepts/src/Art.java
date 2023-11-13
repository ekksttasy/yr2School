
public class Art extends Subject{

	@Override
	public int getCredit() {
		return 80;
	}
	
	Art(String name, String description) {
		super("Fine Arts", "Students learn about classical masters and their works.");
		this.name = super.getName();
		this.description = super.getDescription();
		this.credit = getCredit();
	}

}

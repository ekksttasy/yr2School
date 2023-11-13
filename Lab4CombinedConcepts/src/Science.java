
public abstract class Science extends Subject{
	
	@Override
	public int getCredit() {
		return 100;
		
	}
	
	Science(String name, String description) {
		super(name, description);
		this.credit = getCredit();
	}

}

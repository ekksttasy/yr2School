
public class Ellipse extends Rectangle{
	
	private int sides;
	
	Ellipse(int height, int length) {
		super(height, length);
		super.setSides(1);
		this.sides = super.getSides();
	}
	
	public int getArea() {
		int area = (int) (super.height * super.length * Math.PI);
		return area;
	}
}

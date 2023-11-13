/**
 * ayo erm
 */
public class Circle extends Shape {

	private int radius;
	private int sides;
	
	public int getRadius() {
		return radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	Circle(int radius) {
		super(1);
		this.sides = super.getSides();
		this.radius = radius;
	}


	public int getArea() {
		int area = (int) (radius * Math.PI);
		return area;
	}

}

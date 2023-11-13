public class Driver {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(4, 7);
		Circle c1 = new Circle(8);
		Ellipse e1 = new Ellipse(6, 13);
		
		int area_r1 = r1.getArea();
		int sides_r1 = r1.getSides();
		System.out.println("the area of your rectangle is " + area_r1);
		System.out.println("there are " + sides_r1 + " sides in your rectangle");
		
		int area_c1 = c1.getArea();
		int sides_c1 = c1.getSides();
		System.out.println("the area of your circle is " + area_c1);
		System.out.println("there is " + sides_c1 + " side in your circle");
		
		int area_e1 = e1.getArea();
		int sides_e1 = e1.getSides();
		System.out.println("the area of your ellipse is " + area_e1);
		System.out.println("there is " + sides_e1 + " side in your ellipse");
	}

}

/**
 * Rectangle class. Sub-type of Shape class. Can be used as base for a 'Ellipse' class or for 3-D shapes.
 * 
 * Shows good use of Javadoc comments, annotations, and class hierarchies.
 * 
 * class marked as 'public' for capabilities to be instantiated directly.
 * 
 * @author ekaufman
 */
public class Rectangle extends Shape{
	/**
	 * The number of sides on any rectangle.
	 * 
	 * Uses 'private' modifier as sub-types may have different side alignments.
	 */
	private int sides;
	/**
	 * The height of two of the rectangle's sides.
	 * 
	 * Uses 'protected' modifier for use by sub-types.
	 */
	protected int height;
	/**
	 * The length of the other two sides of the rectangle.
	 * 
	 * Uses 'protected' modifier for use by sub-types.
	 */
	protected int length;
	/**
	 * Getter method to retrieve the height of the rectangle.
	 * 
	 * @param height is the height as declared above.
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * Getter method to retrieve the length of the rectangle.
	 * 
	 * @param length is the height as declared above.
	 */
	public int getLength() {
		return length;
	}
	/**
	 * Sets the height of the shape.
	 * 
	 * @param height the height of the shape.
	 */
	public void setHeight(int height) {
		this.height = height; //use this.height to distinguish between parameter and attribute.
	}
	/**
	 * Sets the length of the shape.
	 * 
	 * @param length the length of the shape.
	 */
	public void setLength(int length) {
		this.length = length; //use this.length to distinguish between parameter and attribute.
	}
	/**
	 * Getters & Setters for height/length could be condensed into two methods instead of four.
	 * 
	 * Spacing them out allows for more flexibility.
	 */

	/**
	 * Constructor - defines a rectangle as having height, length, and four sides.
	 * 
	 * @param sides - the number of sides in a rectangle.
	 * @param height - the height of the rectangle object.
	 * @param length - the length of the rectangle object.
	 */
	Rectangle(int height, int length) {
		super(4);
		this.sides = super.getSides();
		this.height = height;
		this.length = length;
	}
	/**
	 * Gets the area of the rectangle using height*length.
	 * 
	 * @param height the height of the rectangle.
	 * @param length the length of the rectangle.
	 * @return the area of the rectangle.
	 */
	public int getArea() {
		int area = height * length;
		return area;
	}

}

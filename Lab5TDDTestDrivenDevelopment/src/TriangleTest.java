import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TriangleTest {

	// Constructor Tests
	
	@Test
	void testBasicConstructor() {
		Triangle t = new Triangle();
		
		assertTrue(t.isEquilateral());
		assertFalse(t.isScalene());
		assertFalse(t.isIsosceles());
	}
	
	@Test
	void testEqualConstructor() {
		Triangle t = new Triangle(10);
		
		assertTrue(t.isEquilateral());
		assertFalse(t.isScalene());
		assertFalse(t.isIsosceles());
	}
	
	@Test
	void testScaleneConstructor() {
		Triangle t = new Triangle(10, 8, 3);
		
		assertFalse(t.isEquilateral());
		assertTrue(t.isScalene());
		assertFalse(t.isIsosceles());
	}
	
	@Test
	void testIsoscelesConstructor() {
		Triangle t = new Triangle(10, 8);
		
		assertFalse(t.isEquilateral());
		assertFalse(t.isScalene());
		assertTrue(t.isIsosceles());
	}
	
	// Getter & Setter Tests
	
	//testIsocosleslessides
	
	// All Other Tests
	
	@Test
	void testCopy() {
		Triangle t = new Triangle(10, 8, 3);
		Triangle t2 = t.copy();
		assertTrue(t == t2);
	}
	
	@Test
	void testPerimeterGetter() {
		Triangle t = new Triangle(10, 8, 3);
		int tPerim = 10+8+3;
		assertTrue(t.getPerimeter() == tPerim);
	}
	
	@Test
	void testAvgLengthGetter() {
		Triangle t = new Triangle(10, 8, 3);
		int tAvgLength = (10 + 8 + 3) / 3;
		assertTrue(t.getAverageLength() == tAvgLength);
	}

}

package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import shapes.Circle;

public class TestCircle {
	Circle circle = new Circle();

	@Before
	public void setUp() throws Exception {
	}

	
	//Set Delta to .001 as I rounded to 3 decimal places
	@Test
	public void testCircleCircumferenceOne() {
		circle.setRadius(3);
		assertEquals(18.849, circle.circumference(), 0.001);
	}
	
	@Test
	public void testCircleCircumferenceTwo() {
		circle.setRadius(78);
		assertEquals(490.088, circle.circumference(), 0.001);
	}
	
	@Test
	public void testCircleArea() {
		circle.setRadius(8);
		assertEquals(201.062, circle.area(), 0.001);
	}
	
	@Test
	public void testCircleNotNull() {
		circle.setRadius(8);
		assertNotNull(circle);
	}

}

package tests;

import static org.junit.Assert.*;

import shapes.Rectangle;

import org.junit.Before;
import org.junit.Test;

public class TestRectangle {
	Rectangle rec = new Rectangle();
	
	@Before
	public void setUp() throws Exception {
	}

	//Set Delta to .001 as I rounded to 3 decimal places
	@Test
	public void testRectanglePerimeterOne() {
		rec.setLength(8d);
		rec.setWidth(12d);
		assertEquals(40, rec.perimeter(), 0.001);
	}
	
	@Test
	public void testRectanglePerimeterTwo() {
		rec.setLength(4.15);
		rec.setWidth(2.62);
		assertEquals(13.54, rec.perimeter(), 0.001);
	}
	
	@Test
	public void testRectangleArea() {
		rec.setLength(8);
		rec.setWidth(12);
		assertEquals(96, rec.area(), 0.001);
	}
	@Test
	public void testRectangleIsSquare() {
		rec.setLength(5);
		rec.setWidth(5);
		assertTrue(rec.isSquare());
	}
	@Test
	public void testRectangleIsNotSquare() {
		rec.setLength(7);
		rec.setWidth(9);
		assertFalse(rec.isSquare());
	}

}

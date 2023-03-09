package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class RectangleTestCase {

	private Rectangle rect;
	private Rectangle rect1;
	private Rectangle square;
	private Point p;
	
	@BeforeEach
	public void setUp() throws Exception {
		p = new Point(2,3);
		rect = new Rectangle(p, 3, 4);
	}
	
	@Test
	void rectanglePerimeterTest() {
		assertEquals(14.0f, rect.rectanglePerimeter(),0.00);
	}
	
	@Test
	void rectangleAreaTest() {
		assertEquals(12.0f, rect.rectangleArea(),0.00);
	}
	
	@Test
	void rectangleLargestSideWidthTest() {
		rect1 = new Rectangle(p, 5, 2);
		assertEquals("Horizontal",rect1.largestSide());
	}
	
	@Test
	void rectangleLargestSideEightTest() {
		assertEquals("Vertical",rect.largestSide());
	}
	
	@Test
	void itIsNotARectangleTest() {
		square = new Rectangle(p, 5, 5);
		assertEquals("It's not a Rectangle",square.largestSide());
	}

}

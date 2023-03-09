package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PointTestCase {
	private Point p;
	private Point p1;
	private Point pAdd;
	
	@BeforeEach
	public void setUp() throws Exception {
		p = new Point();
	}
	
	@Test
	void newDefault00PointTest() {
		assertTrue(p.getX() == 0);
		assertTrue(p.getY() == 0);
	}
	
	@Test
	void newDeclaredXYPointTest() {
		p = new Point(2,5);
		assertTrue(p.getX() == 2);
		assertTrue(p.getY() == 5);
	}
	
	@Test
	void movePointToTest() {
		p = new Point(2,5);
		p.movePointTo(9,10);
		assertTrue(p.getX() == 9);
		assertTrue(p.getY() == 10);
	}
	
	@Test
	void addTwoPointsTest() {
		p = new Point(2,5);
		p1 = new Point(4,9);
		pAdd = p.addToPoint(p1);
		assertNotNull(pAdd);
		assertTrue(pAdd.getX() == 6);
		assertTrue(pAdd.getY() == 14);
	}

}

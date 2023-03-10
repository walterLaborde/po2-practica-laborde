package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonTestCase {
	private Person p;
	private Person p1;
	private Person p2;
	
	
	@BeforeEach
	public void setUp() throws Exception {
		p = new Person("Cholo", LocalDate.of(1976, 7, 2));
		p1 = new Person("Micho", LocalDate.of(1956, 7, 9));
		p2 = new Person("Tito", LocalDate.of(1986, 1, 2));
	}
	@Test
	void personAgeTest() {
		assertEquals(46,p.age());
	}
	
	@Test
	void pYoungerThanP1Test() {
		assertTrue(p.youngerThan(p1));
	}
	
	//@Test
	void pYoungerThanP2Test() {
		assertTrue(p.youngerThan(p2));
	}

}

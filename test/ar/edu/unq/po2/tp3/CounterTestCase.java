package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CounterTestCase {
	
	// creo la variable privada (nombre y tipo) que voy a usar
	private Counter counter;

	@BeforeEach
	public void setUp() throws Exception {
		// creo una instancia de la clase Counter y le asigno la variable
		// ya creada
		counter = new Counter();
		// add numbers to the list
		counter.addNumberToList(8);
		counter.addNumberToList(3);
		counter.addNumberToList(5);
		counter.addNumberToList(7);
		counter.addNumberToList(9);
		counter.addNumberToList(1);
		counter.addNumberToList(1);
		counter.addNumberToList(1);
		counter.addNumberToList(1);
		counter.addNumberToList(4);
	}
	
	@Test
	void evenOcurrencesTest() {
		assertEquals(8, counter.unevenOcurrences(counter.getNumbers()));
	}

	@Test
	void unevenOcurrencesTest() {
		assertEquals(2, counter.evenOcurrences(counter.getNumbers()));
	}

	@Test
	void multipleOfOcurrencesTest() {
		assertEquals(2, counter.multipleOfOcurrences(counter.getNumbers(),2));
	}

	
}

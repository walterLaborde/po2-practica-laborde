package ar.edu.unq.po2.tp3;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DesarmedNumberTestCase {

	// doy de alta la variable que voy a usar
	private DesarmedNumber disNum;
	
	@BeforeEach
	public void setUp() throws Exception {
		disNum = new DesarmedNumber();
		disNum.addNumberToList(5394128);
		disNum.addNumberToList(21);
		disNum.addNumberToList(11);
		disNum.addNumberToList(66);
	}
	
	@Test
	void mostEvenDigitsTest() {
		assertEquals(5394128, disNum.mostEvenDigitsNumber(disNum.getNumbers()));
	}

}

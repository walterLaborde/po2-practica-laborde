package ar.edu.unq.po2.tp3;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MultioperatorTestCase {
	private Multioperator mOp;
	
	@BeforeEach
	public void setUp() throws Exception {
		mOp = new Multioperator();
		mOp.addEnteroToList(2);
		mOp.addEnteroToList(1);
		mOp.addEnteroToList(1);
		mOp.addEnteroToList(1);
		mOp.addEnteroToList((-1));
		mOp.addEnteroToList(1);
	}
	
	@Test
	void multioperatorSumTest() {
		assertEquals(5,mOp.sumEnteros(mOp.getEnteros()));
	}
	
	@Test
	void multioperatorSubtractTest() {
		assertEquals(-1,mOp.subtractEnteros(mOp.getEnteros()));
	}
	
	@Test
	void multioperatorMultiplyTest() {
		assertEquals(-2,mOp.multiplyEnteros(mOp.getEnteros()));
	}

}

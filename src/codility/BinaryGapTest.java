package codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class BinaryGapTest {

	@Test
	public void testSolution1() { 
		BinaryGap bg = new BinaryGap();
		assertEquals(0, bg.solution(0b1));
	}

	@Test
	public void testSolution2() {
		BinaryGap bg = new BinaryGap();
		assertEquals(0, bg.solution(0b11));
	}

	@Test
	public void testSolution3() {
		BinaryGap bg = new BinaryGap();
		assertEquals(1, bg.solution(0b101));
	}
	
	@Test
	public void testSolution4() {
		BinaryGap bg = new BinaryGap();
		assertEquals(2, bg.solution(0b1001));
	}
}

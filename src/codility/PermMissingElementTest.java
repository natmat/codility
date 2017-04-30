package codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermMissingElementTest {

	@Test
	public void test1() {
		final int[] actuals = new int[] {1,2,3,5};
		final int expected = 4;
		assertEquals(expected,  PermMissingElement.solution(actuals));
	}

	@Test
	public void test2() {
		final int[] actuals = new int[] {};
		final int expected = 1;
		assertEquals(expected,  PermMissingElement.solution(actuals));
	}
}

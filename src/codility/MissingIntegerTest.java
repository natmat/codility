package codility;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class MissingIntegerTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void test_1() {
		final int expected = 2;
		int[] A = {1};
		assertTrue(MissingInteger.solution(A) == expected);
	}

	@Test
	public void test_1_3() {
		final int expected = 2;
		int[] A = {1, 3};
		assertTrue(MissingInteger.solution(A) == expected);
	}

	@Test
	public void test_3_m1() {
		final int expected = 1;
		int[] A = {-3, -1};
		assertTrue(MissingInteger.solution(A) == expected);
	}

	@Test
	public void test_136412() {
		final int expected = 5;
		int[] A = {1, 3, 6, 4, 1, 2};
		assertTrue(MissingInteger.solution(A) == expected);
	}
}

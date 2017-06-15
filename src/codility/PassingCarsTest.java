package codility;

import static org.junit.Assert.*;
//import codility.PassingCars;

import org.junit.Test;

public class PassingCarsTest {
	
	@Test
	public void test() {
		final int A[] = {0,1,0,1,1};
		final int expected = 5;
		assertEquals(expected, PassingCars.solution(A));
	}

	@Test
	public void testMax() {
		int len = 10000000;
		int A[] = new int[len];
		for (int i = 1 ; i < A.length ; i++) {
			A[i] = 1;
		}
		final int expected = -1;
		System.out.println(PassingCars.solution(A));
		assertEquals(expected, PassingCars.solution(A));
	}
}

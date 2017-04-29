package codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class CyclicRotationTest {

	@Test
	public void testExample1() {
		CyclicRotation cr = new CyclicRotation();
		int[] expected = {5,1,2,3,4};
		assertArrayEquals(expected, cr.solution(new int[] {1,2,3,4,5}, 1));
	}

	@Test
	public void testExample2() {
		CyclicRotation cr = new CyclicRotation();
		int[] expected = {4,5,1,2,3};
		assertArrayEquals(expected, cr.solution(new int[] {1,2,3,4,5}, 2));
	}

	@Test
	public void testExample3() {
		CyclicRotation cr = new CyclicRotation();
		int[] expected = {3,4,5,1,2};
		assertArrayEquals(expected, cr.solution(new int[] {1,2,3,4,5}, 3));
	}
}

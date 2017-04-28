package codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class CyclicRotationTest {

	@Test
	public void testExample() {
		CyclicRotation cr = new CyclicRotation();
		int[] expected = {5,1,2,3,4};
		assertArrayEquals(expected, cr.solution(new int[] {1,2,3,4,5}, 1));
	}
}

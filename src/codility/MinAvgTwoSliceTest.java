package codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class MinAvgTwoSliceTest {

	@Test
	public void testSolution() {
		MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();
		int[] A = {-3,-5,-8,-4,-10};
		assertEquals(3, minAvgTwoSlice.solution(A));
	}
}

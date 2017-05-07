package codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrogRiverOneTest {

	@Test
	public void test1() {
		FrogRiverOne fro = new FrogRiverOne();
		int[] input = new int[] {1,2,3};
		assertEquals(2, fro.solution(3, input));
	}

	@Test
	public void test2() {
		FrogRiverOne fro = new FrogRiverOne();
		int[] input = new int[] {0,1,2,3};
		assertEquals(-1, fro.solution(3, input));
	}

	@Test
	public void test3() {
		FrogRiverOne fro = new FrogRiverOne();
		int[] input = new int[] {4,1,2,3};
		assertEquals(-1, fro.solution(3, input));
	}	
}

package codility;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class TapeEquilibriumTest {

	@Test
	public void test() {
		TapeEquilibrium te = new TapeEquilibrium();
		int[] actual = new int[100000000];
		for (int i = 0 ; i < actual.length ; i++) {
			actual[i] = new Random().nextInt(2000) - 1000;
		}
		final int expected = te.solution(actual);
		System.out.println("te.solution()=" + expected);
		assertEquals(expected, te.solution(actual));
	}
}

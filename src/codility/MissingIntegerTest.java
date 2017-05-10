package codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class MissingIntegerTest {

	private static MissingInteger mi = new MissingInteger();
	
	@Test
	public void test1() {
		int[] actual = new int[] {-2,-1,0};
		assertEquals(1,  mi.solution(actual));
	}
	
	@Test
	public void test2() {
		int[] actual = new int[] {-2,-1,0,1,2};
		assertEquals(3,  mi.solution(actual));
	}
}

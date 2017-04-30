package codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class FrogJmpTest {

	@Test
	public void test1() {
		assertEquals(0, FrogJmp.solution(0, 0, 1));
	}

	@Test
	public void test2() {
		// Many hops, exact number
		assertEquals(10, FrogJmp.solution(0,10,1));
	}

	@Test
	public void test3() {
		assertEquals(5, FrogJmp.solution(0, 10, 2));
	}

	@Test
	public void test4() {
		assertEquals(3, FrogJmp.solution(0, 11, 5));
	}

	@Test
	public void test5() {
		assertEquals(3, FrogJmp.solution(0, 12, 5));
	}
}

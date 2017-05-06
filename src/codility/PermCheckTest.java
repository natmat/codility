package codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class PermCheckTest {

	@Test
	public void test1() {
		PermCheck pc = new PermCheck();
		int[] actual = new int[] {1,2,3,4};
		assertEquals(1, pc.solution(actual));
	}

	@Test
	public void test2() {
		PermCheck pc = new PermCheck();
		int[] actual = new int[] {1,1,1,1,1};
		assertEquals(0, pc.solution(actual));
	}

	@Test
	public void test3() {
		PermCheck pc = new PermCheck();
		int[] actual = new int[] {1,4,1};
		assertEquals(0, pc.solution(actual));
	}

	@Test
	public void test4() {
		PermCheck pc = new PermCheck();
		int[] actual = new int[] {1};
		assertEquals(1, pc.solution(actual));
	}

	@Test
	public void test5() {
		PermCheck pc = new PermCheck();
		int[] actual = new int[] {2};
		assertEquals(0, pc.solution(actual));
	}

}

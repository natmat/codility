package codility;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class QuickSortTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testNull() {
		int[] array = null;
		int[] expected = null;
		QuickSort.sort(array);
		assertArrayEquals(expected, array);
	}

	@Test
	public void testOneElem() {
		int[] array = {1};
		int[] expected = array.clone();
		QuickSort.sort(array);
		assertArrayEquals(expected, array);
	}

	@Test
	public void testTwoElem() {
		int[] array = {2,1};
		int[] expected = {1,2};
		QuickSort.sort(array);
		assertArrayEquals(expected, array);
	}
}

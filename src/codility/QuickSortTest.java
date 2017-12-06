package codility;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class QuickSortTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testOneElem() {
		int[] actual = {1};
		int[] expected = actual.clone();
		QuickSort.quickSort(actual, 0, actual.length);
		assertArrayEquals(expected, actual);
	}

	@Test
	public void testTwoElem() {
		int[] actual = {2,1};
		int[] expected = {1,2};
		QuickSort.quickSort(actual, 0, actual.length);
		assertArrayEquals(expected, actual);
	}
}

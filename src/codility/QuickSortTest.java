package codility;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class QuickSortTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testNoElems() {
		int[] actuals = null;
		int[] expecteds = null;
		QuickSort.quickSort(actuals, 0, 0);
		assertArrayEquals(expecteds, actuals);
	}
	@Test
	public void testOneElem() {
		int[] actuals = {1};
		int[] expeceds = actuals.clone();
		QuickSort.quickSort(actuals, 0, actuals.length-1);
		assertArrayEquals(expeceds, actuals);
	}


	@Test
	public void testTwoElem() {
		int[] actuals = {2,1};
		int[] expecteds = {1,2};
		QuickSort.quickSort(actuals, 0, actuals.length-1);
		assertArrayEquals(expecteds, actuals);
	}

	@Test
	public void testTenElem() {
		int[] actuals = {1,1,1,1,1,1,5,1,1,1,1,1};
		int[] expecteds = {1,1,1,1,1,1,1,1,1,1,1,5};
		QuickSort.quickSort(actuals, 0, actuals.length-1);
		assertArrayEquals(expecteds, actuals);
	}
}

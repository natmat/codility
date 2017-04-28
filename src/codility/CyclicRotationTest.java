package codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class CyclicRotationTest {

	@Test
	public void testExample() {
		CyclicRotation cr = new CyclicRotation();
		assertArrayEquals([1, 2,3,4,5], cr.solution([1, 2,3,4,5]), 0);
	}
}

package codility;

import static org.junit.Assert.*;

import org.junit.Test;

public class OddOccurrencesInArrayTest {

	@Test
	public void test() {
		OddOccurrencesInArray ooia = new OddOccurrencesInArray();
		int[] data = new int[] {1,1,2,2,3}; 
		assertEquals(3, ooia.solution(data));
	}
}

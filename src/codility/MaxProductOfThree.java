package codility;

import java.util.Arrays;

public class MaxProductOfThree {
	public MaxProductOfThree() {
		int expecteds[] = {-3, 1, 2, -1, 5, 6};
		solution(expecteds);
	}

	int solution(int[] A) {
		int last = A.length-1;

		Arrays.sort(A);
		
		int max = Integer.MIN_VALUE;
		if ((A[0]*A[1] > 0) && (A[A.length-1] > 0)) {
			max = Math.max(A[0]*A[1]*A[A.length-1], max);
		}

		max = Math.max(A[last]*A[last-1]*A[last-2], max);
		return(max);
	}
}



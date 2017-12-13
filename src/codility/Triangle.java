package codility;

import java.util.Arrays;

public class Triangle {
	public static void main(String[] args) {
		int[] actuals = {10,2,5,1,8,20};
		System.out.println(solution(actuals));
	}

	public static int solution(int[] A) {
		Arrays.sort(A);

		if ((A == null) || (A.length < 3)) return(0); 

		for (int p = 0 ; p < A.length-2 ; p++) {
			for (int q = p+1 ; q < A.length-1 ; q++) {
				// Avoid overflow
				final int r = q+1;
				if (A[p] > A[r] - A[q]) { 
					return(1);
				}
			}            
		}
		return(0);        
	}
}


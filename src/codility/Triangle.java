package codility;

import java.util.Arrays;

public class Triangle {
	public static void main(String[] args) {
		int[] actuals = {10,2,5,1,8,20};
		System.out.println(solution(actuals));
	}

	public static int solution(int[] A) {
		Arrays.sort(A);

		if (A.length == 0) return(0);
		if (A.length == 1) return(1);

		for (int p = 0 ; p < A.length-3 ; p++) {
			for (int q = p+1 ; q < A.length-1 ; q++) {
				if (A[p] + A[q] > A[q+1]) { 
					return(1);
				}
			}            
		}
		return(0);        
	}
}


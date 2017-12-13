package codility;

import java.util.Arrays;

public class Triangle {
	public static void main(String[] args) {
		int[] actuals = {10,2,5,1,8,20};
		System.out.println(solution(actuals));
	}

	public static int solution(int[] A) {
		if (A == null || A.length <3) return(0);

		Arrays.sort(A);
		for (int p = 0 ; p < A.length-2 ; p++) {
			for (int q = p+1 ; q < A.length-1 ; q++) {
				int r = q+1;
				long sum = A[p]+A[q];
				if (sum > A[r]) 
					return(1);
			}
		}
		return(0);
	}
}

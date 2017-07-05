package codility;

public class MinAvgTwoSlice {

	public static void main (String[] args) {
		MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();
		int[] A = {4,2,2,5,1,5,8};
		System.out.println(minAvgTwoSlice.solution(A));
	}

	public int solution(int[] A) {
		int sum = A[0] + A[1];
		int idx = 0;
		
		for (int i = 2 ; i < A.length ; i++) {
			if (sum > A[i-1] + A[i]) {
				sum = A[i-1] + A[i];
				idx = i;
			}
		}
		return(idx);
	}
}

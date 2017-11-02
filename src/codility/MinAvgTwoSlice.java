package codility;

public class MinAvgTwoSlice {

	public static void main (String[] args) {
		MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();
		int[] A = {-3,-5,-8,-4,-10};
		System.out.println(minAvgTwoSlice.solution(A));
	}

	public int solution(int[] A) {
		double a = (A[0] + A[1])/2;
		int i = 0;
		for (int j = 2 ; j < A.length ; j++) {
			double tmp = a;
			a = Math.min(a, (A[j-2] + A[j-1] + A[j])/3.0);
			a = Math.min(a, (A[j-1] + A[j])/2.0);
			if (a < tmp) {
				i = j;
			}
		}
		return(i);
	}
}

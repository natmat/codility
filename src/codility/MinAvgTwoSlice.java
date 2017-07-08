package codility;

public class MinAvgTwoSlice {

	public static void main (String[] args) {
		MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();
		int[] A = {-3,-5,-8,-4,-10};
		System.out.println(minAvgTwoSlice.solution(A));
	}

	public int solution(int[] A) {
		double a = 10000;
		int i = 0;
		for (int j = 0 ; j < A.length-1 ; j++) {
			double tmp = a;
			a = Math.min(a, (A[j] + A[j+1])/2.0);
			if (j < A.length-2) {
				a = Math.min(a, (A[j] + A[j+1] + A[j+2])/3.0);
			}
			if (a < tmp) {
				i = j;
			}
		}
		return(i);
	}
}

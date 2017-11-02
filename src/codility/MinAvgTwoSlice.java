package codility;

public class MinAvgTwoSlice {

	public static void main (String[] args) {
		MinAvgTwoSlice minAvgTwoSlice = new MinAvgTwoSlice();
		int[] A = {-3,-5,-8,-4,-10};
		System.out.println(minAvgTwoSlice.solution(A));
	}

	public int solution(int[] A) {
<<<<<<< HEAD
		double a = (A[0] + A[1])/2;
		int i = 0;
		for (int j = 2 ; j < A.length ; j++) {
			double tmp = a;
			a = Math.min(a, (A[j-2] + A[j-1] + A[j])/3.0);
			a = Math.min(a, (A[j-1] + A[j])/2.0);
=======
		double a = 10000;
		int i = 0;
		for (int j = 0 ; j < A.length-1 ; j++) {
			double tmp = a;
			a = Math.min(a, (A[j] + A[j+1])/2.0);
			if (j < A.length-2) {
				a = Math.min(a, (A[j] + A[j+1] + A[j+2])/3.0);
			}
>>>>>>> branch 'MinAvgTwoSlice' of https://github.com/natmat/codility.git
			if (a < tmp) {
				i = j;
			}
		}
		return(i);
	}
}

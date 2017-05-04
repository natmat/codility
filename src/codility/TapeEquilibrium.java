package codility;

public class TapeEquilibrium {

	public static void main(String[] args) {
		TapeEquilibrium te = new TapeEquilibrium();
		System.out.println("TapeEquilibrium=" + te.solution(new int[] {1,2,3,4,5}));
	}

	public int solution(int[] A) {
		int sum = 0;
		for (int i : A) {
			sum += i;
		}
		int sumL = A[0];
		int sumR = sum - sumL;
		int min = Math.abs(sumL - sumR);

		for (int p = 1 ; p < A.length-1 ; p++) {
			sumL += A[p];
			sumR -= A[p];
			int diff = Math.abs(sumL - sumR);
			if (min > diff) {
				min = diff;
			}
			//		 			System.out.println("L="+sumL+",sumR="+sumR+",diff="+diff+",min="+min);
		}
		return(min);
	}
}

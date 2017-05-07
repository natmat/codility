package codility;

public class FrogRiverOne {

	public static void main(String[] args) {
		FrogRiverOne fro = new FrogRiverOne();
		int[] input = new int[] {1,3,1,4,2,3,5,4};
		System.out.println("FrogRiverOne=" + fro.solution(5, input));
	}

	public int solution(int X, int[] A) {
		int[] L = new int[X+1];
		long total = X*(X+1)/2;
		for (int i = 0 ; i < A.length ; i++) {
			if (L[A[i]] == 0) {
				L[A[i]] = A[i];
				total -= A[i];
				if (0 == total) {
					return(i);
				}
			}
		}
		return(-1);
	}
}

package codility;

public class CyclicRotation {
	public static void main(String[] args) {
		CyclicRotation cr = new CyclicRotation();
		final int[] A = {1,2,3,4,5};
		final int K = 3;
		int[] B = cr.solution(A, K);
		for (int i: B) {
			System.out.print(i + ",");
		}
	}

	public int[] solution(int[] A, int K) {
		System.out.println("Solution()");
		if ((0 == K) || (0 == A.length)) {
			return(A);
		}

		for (int i = 0 ; i < K ; i++) {
			for (int j = 0 ; j < A.length ; j++) {
				swap(A, 0, j);
			}
		}
		return(A);
	}
	
	private static void swap(int[] A, int i, int j) {
		int tmp = A[i];
		A[i] = A[j];
		A[j] = tmp;
	}
}

/*
extreme_empty 
empty array ✔OK
▶ single 
one element, 0 <= K <= 5 ✔OK
▶ double 
two elements, K <= N ✔OK
▶ small1 
small functional tests, K < N ✔OK
▶ small2 
small functional tests, K >= N ✔OK
▶ small_random_all_rotations 
small random sequence, all rotations, N = 15 ✔OK
▶ medium_random 
medium random sequence, N = 100 ✔OK
▶ maximal 
maximal N and K
*/

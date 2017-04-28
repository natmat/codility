package codility;

public class CyclicRotation {
	public static void main(String[] args) {
		CyclicRotation cr = new CyclicRotation();
		final int[] A = {}; //3,8,9,7,6};
		final int K = 0;
		int[] B = cr.solution(A, K);
		for (int i: B) {
			System.out.print(i + ",");
		}
	}

	public int[] solution(int[] A, int K) {
		if ((0 == K) || (0 == A.length)) {
			return(A);
		}
		int shift = A.length - K % A.length;
		int[] B = new int[A.length];
		for (int i = 0 ; i < A.length ; i++) {
			B[i] = A[(i+shift)%A.length];
		}
		return(B);
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

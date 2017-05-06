package codility;

public class PermCheck {
	public static void main(String[] args) {
		PermCheck pc = new PermCheck();
		int[] A = new int[] {1,2,3,4};
		System.out.println("PermCheck=" + pc.solution(A));
		int[] B = new int[] {1,2,3,5};
		System.out.println("PermCheck=" + pc.solution(B));
	}

	int solution(int[] A) {
		int[] B = new int[A.length + 1];
		int i;
		for (i = 0 ; i < A.length ; i++) {
			if ((A[i] > A.length) || (B[A[i]] != 0)) { 
				return(0);
			}
			else {
				B[A[i]] = A[i];
			}
		}
		for (i = 1 ; i < B.length ; i++) {
			if (0 == B[i]) {
				return(0); 
			}
		}
		return(1);
	}
}


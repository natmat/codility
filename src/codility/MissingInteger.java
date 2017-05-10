package codility;

public class MissingInteger {

	public static void main(String[] args) {
		MissingInteger mi = new MissingInteger();
		System.out.println("MissingInteger=" + mi.solution(new int[] {1,2,3,5}));
	}

	public int solution(int[] A) {
		final int N = 100000;
		int[] B = new int[N+1];
		for (int i : A) {
			if ((i > 0) && (i <= N)){
				B[i] = 1;
			}
		}
		int j;
		for (j = 1  ; j < N+1 ; j++) {
			if (B[j] == 0) {
				break;
			}
		}
		return(j);
	}
}


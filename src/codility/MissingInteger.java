package codility;

public class MissingInteger {

	public static int solution(int[] A) {
		int i;
		int[] missing = new int[A.length+1];
		for (i = 0 ; i < A.length ; i++) {
			if ((A[i] > 0) && (A[i] <= A.length)) {
				missing[A[i]] = 1;
			}
		}
		for (i = 1 ; i < missing.length ; i++) {
			if (missing[i] == 0) {
				return(i);
			}
		}
		return(i);
	}
}




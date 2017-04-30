package codility;

public class PermMissingElement {

	public static void main(String[] args) {
		final int[] input = new int[] {1,2,3,5};
		System.out.println("Solution=" + PermMissingElement.solution(input));
	}

	public static int solution(int[] A) {
		if (0 == A.length) {
			return(1);
		}

		int total = 0;
		for (int i : A) {
			total += i;
		}
		return(int)(((long)A.length + 1)*((long)A.length + 2)/2 - total);
	}
}

package codility;

public class FrogRiverOne {

	public static void main(String[] args) {
		FrogRiverOne fro = new FrogRiverOne();
		int[] input = new int[] {1,3,1,4,2,3,5,4};
		System.out.println("FrogRiverOne=" + fro.solution(5, input));
	}

	public int solution(int X, int[] A) {
		boolean[] leaves = new boolean[X+1];
		int steps = X;
		for (int i = 0 ; i < A.length ; i++) {
			if (!leaves[A[i]]) {
				leaves[A[i]] = true;
				steps--;
				if (0 == steps) {
					return(i);
				}
			}
		}
		return(-1);
	}
}

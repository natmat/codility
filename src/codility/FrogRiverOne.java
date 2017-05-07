package codility;

public class FrogRiverOne {

	public static void main(String[] args) {
		FrogRiverOne fro = new FrogRiverOne();
		int[] input = new int[] {1,3,1,4,2,3,5,4};
		System.out.println("FrogRiverOne=" + fro.solution(5, input));
	}

	public int solution(int X, int[] A) {
		int[] leaves = new int[X+1];
		long total = X*(X+1)/2;
		for (int i = 0 ; i < A.length ; i++) {
			int leaf = A[i];
			if ((leaf < 1) || (leaf > X)) {
				break;
			}
			if (leaves[leaf] == 0) {
				leaves[leaf] = leaf;
				total -= leaf;
				if (0 == total) {
					return(i);
				}
			}
		}
		return(-1);
	}
}

package codility;

public class MaxCounters {

	public static void main(String[] args) {
		MaxCounters mc = new MaxCounters();
		show(mc.solution(5, new int[] {3,2,2,4,2}));
	}

	public int[] solution(int N, int[] A) {
		int max = 0;
		int[] B = new int[N];
		for (int i : A) {
			if (i <= N) {
				B[i-1]++;
				max = Math.max(max, B[i-1]);
			}
			else {
				for (int j = 0 ; j < N ; j++) {
					B[j] = max;
				}
			}
		}
		return(B);
	}
	
	private static void show(int[] A) {
		for (int i : A) {
			System.out.print(i+",");
		}
		System.out.println();
	}
}

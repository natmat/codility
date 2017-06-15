package codility;

public class PassingCars {

	public static void main(String[] args) {
		final int[] A = {0,1,0,1,1};
		PassingCars.solution(A);
	}

	public static int solution(int[] A) {
		final int len = A.length;
		int count = 0;
		int[] sum = new int[len];
		for (int i = 0 ; i < len ; i++) {
			count += A[i];
			sum[i] += count;
		}
//		printArray(sum);
		 
		count = 0;
		int total = sum[len-1];
		for (int i = 0 ; i < len ; i++) {
			if (A[i] == 0) {
				count += total - sum[i];
				if (count > 1000000000) return(-1);
			}
		}
		return(count);
	}
	
	private static void printArray(int[] a) {
		for (int i = 0 ; i < a.length ; i++) {
			System.out.print(a[i]);
		}
		System.out.println();
	}
}
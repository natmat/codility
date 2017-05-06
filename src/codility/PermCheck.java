package codility;

public class PermCheck {
	public static void main(String[] args) {
		PermCheck pc = new PermCheck();
		int[] A = new int[] {1,1,1,1,1};
		System.out.println("PermCheck=" + pc.solution(A));
	}

	int solution(int[] a) {
		int n = a.length;
		int sum = 0;
		for (int i : a) {
			sum += i;
		}
		// System.out.println("sum=" + sum);
		int total = n*(n + 1)/2;
		// System.out.println("total=" + total);
		return((int)((total == sum) ? 1 : 0));
	}
}


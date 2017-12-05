package codility;

public class Sort {

	public static void main(String[] args) {
		int[] arr = {10,2,1,8,20};
		System.out.println(Solution(arr));
	}

	private static int Solution(int[] A) {
		if (A.length < 3) return 0;

		show(A);
		sort(A);
		show(A);

		int len = A.length;
		for (int p = 0  ; p < len ; p++) {
			for (int q = p+1  ; q < len ; q++) {
				for (int r = q+1  ; r < len ; r++) {
					if ((A[p] + A[q] > A[r]) && 
							(A[q] + A[r] > A[q]) &&
							(A[r] + A[p] > A[q])) {
						return(1);
					}
				}
			}		
		}
		return(0);
	}

	static void sort(int[] a) {
		int len = a.length;
		for (int i = 0 ; i < len-1 ; i++) {
			for (int j = 1 ; j < len-i ; j++) {
				if (a[j-1] > a[j]) {
					int tmp = a[j];
					a[j] = a[j-1];
					a[j-1] = tmp;
				}
			}
		}
	}

	static void show(int[] a) {
		for (int i = 0 ; i < a.length ; i++) {
			System.out.print(a[i] + " ") ;
		}
		System.out.println();
	}
}


package codility;

public class QuickSort {
	
	public static void main(String[] args) {
		int a[] = {1,5,4,2,3};
		sort(a);
	}

	public static void sort(int[] array) {
		show(array);
		if (array == null) {
			return;
		}

		partition(array, 0, array.length-1);
	}

	static void partition(int[] a, int low, int high) {
		show(a);
		if (low == high) return;
		
		int l = low;
		int h = high;
		int mid = (low + high)/2;
		int p = a[mid];

		while ((l < mid) || (h > mid)) {
			while (a[l] < p) l++;
			while (a[h] > p) h--;
			
			if ((l < mid) && (h > mid)) {
				swap(a, l, h);
			}
		}
		
		partition(a, low, l);
		partition(a, h, high);
	}

	static void swap(int[] a, int f, int g) {
		int tmp = a[f];
		a[f] = a[g];
		a[g] = tmp;
	}
	
	static void show(int[] a) {
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println("\n");
	}
}

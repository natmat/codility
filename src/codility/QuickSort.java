package codility;

import java.util.Arrays;

public class QuickSort {
	
	public static void main(String[] args) {
//		int a[] = {1,5,4,2,3,6,9,8,7};
//		int a[] = {1,3,2};
		int[] a = { 9, 2, 4, 7, 3, 7, 10 };
		quickSort(a, 0, a.length-1);
		System.out.println("DONE");
	}

	static void quickSort(int[] arr, int low, int high) {
		System.out.println("low=" + low + ",high=" + high);
		if ((arr == null) || (low >= high) || (arr.length == 0)) return;
		show(arr);
		
		int l = low;
		int h = high;
		int middle = low + (high - low)/2;
		int p = arr[middle];

		while (l <= h) {
			while (arr[l] < p) l++;
			while (arr[h] > p) h--;
			
			if (l <= h) {
				swap(arr, l, h);
				show(arr);
				l++; 
				h--;
			}
		}
		
		// Recurse
		if (low < h) quickSort(arr, low, h);
		if (high > l) quickSort(arr, l, high);
	}

	static void swap(int[] a, int f, int g) {
		int tmp = a[f];
		a[f] = a[g];
		a[g] = tmp;
	}
	
	static void show(int[] a) {
		System.out.println(Arrays.toString(a));
	}
}

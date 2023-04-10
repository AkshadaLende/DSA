package KunalKush;

import java.util.Arrays;

public class InsertionSort {
	/*
	 * public static void main(String[] args) { int a[] = { 7, 3, 9, 2, 1 };
	 * InsertionSort(a); System.out.println(Arrays.toString(a)); }
	 * 
	 * private static void InsertionSort(int[] a) { // TODO Auto-generated method
	 * stub for (int i = 0; i < a.length - 1; i++) { for (int j = i + 1; j > 0; j--)
	 * { if (a[j] < a[j - 1]) { swap(a, j, j - 1); } else { break; } }
	 * 
	 * } }
	 * 
	 * private static void swap(int[] a, int i, int j) { // TODO Auto-generated
	 * method stub int temp = a[i]; a[i] = a[j]; a[j] = temp;
	 * 
	 * }
	 * 
	 */

//practice

	public static void main(String[] args) {
		int[] a = { 5, 7, 2, 9, 3, 7 };
		sorted(a);
		System.out.println(Arrays.toString(a));
	}

	private static void sorted(int[] a) {
		// TODO Auto-generated method stub
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					swap(a, j, j - 1);
				} else {
					break;
				}
			}
		}

	}

	private static void swap(int[] a, int j, int i) {
		// TODO Auto-generated method stub
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}

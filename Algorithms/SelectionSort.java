package KunalKush;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = { 7, 3, 4, 2, 9, 8};
		selectionSort(a);
		System.out.println(Arrays.toString(a));
	}

	static void selectionSort(int[] a) {
		for (int i = 0; i < a.length; i++) {
			// find the max item in the array and swap with the correct index
			int last = a.length - i - 1;
			int maxIndex = getMaxindex(a, 0, last);
			swap(a, maxIndex, last);
		}

	}

	private static int getMaxindex(int[] a, int start, int last) {
		// TODO Auto-generated method stub
		int max = start;
		for (int i = start; i <= last; i++) {
			if (a[max] < a[i]) {
				max = i;
			}
		}
		return max;
	}

	static void swap(int[] a, int start, int sec) {
		int temp = a[start];
		a[start] = a[sec];
		a[sec] = temp;
	}
}

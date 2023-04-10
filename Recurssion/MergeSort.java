package Recurssion;

import java.util.Arrays;

public class MergeSort {
	
		public static void main(String[] args) {
			int[] a = { 8, 4, 5, 3, 9, 6 };
			a = mergesort(a);
			System.out.println(Arrays.toString(a));
		}

		public static int[] mergesort(int[] a) {
			if (a.length == 1) {
				return a;
			}
			int mid = a.length / 2;

			int[] left = mergesort(Arrays.copyOfRange(a, 0, mid));

			int[] right = mergesort(Arrays.copyOfRange(a, mid, a.length));
			return merge(left, right);
		}

		public static int[] merge(int[] first, int[] second) {

			int[] mix = new int[first.length + second.length];
		int i = 0;
			int j = 0;
			int k = 0;

			while (i < first.length && j < second.length) {
				if (first[i] < second[j]) {
					mix[k] = first[i];
					i++;
				} else {
					mix[k] = second[j];
					j++;
				}
				k++;
			}
			while (i < first.length) {
				mix[k] = first[i];
				i++;
				k++;
			}
			while (j < second.length) {
				mix[k] = second[j];
				j++;
				k++;
			}
			return mix;
		}

	}




package KunalKush;

import java.util.Arrays;

public class MissingNum {
	public static void main(String[] args) {
		int a[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		int aa = missing(a);
		System.out.println(aa);
	}

	static int missing(int[] nums) {
		// TODO Auto-generated method stub
		/*
		 * for (int i = 0; i < nums.length; i++) { int j = nums[i]; if (nums[i] != i &&
		 * nums[i] < nums.length) {
		 * 
		 * swapp(nums, i, j); } }
		 */
		int i = 0;
		while (i < nums.length) {
			int j = nums[i];
			if (nums[i] < nums.length && nums[i] != nums[j]) {

				swapp(nums, i, j);
			} else {
				i++;
			}
		}

		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != j) {
				return j;
			}

		}

		return nums.length;

	}

	private static void swapp(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}

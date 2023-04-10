package KunalKush;

import java.util.ArrayList;
import java.util.List;

public class Duplicates {
	public static void main(String[] args) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		List<Integer> aa = missing(nums);
		System.out.println(aa);
	}

	static List<Integer> missing(int[] nums) {
		// TODO Auto-generated method stub

		/*
		 * for (int i = 0; i < nums.length; i++) { int j = nums[i] - 1; if (nums[i] !=
		 * nums[j]) {
		 * 
		 * swapp(nums, i, j); } }
		 */

		int i = 0;
		while (i < nums.length) {
			int j = nums[i] - 1;
			if (nums[i] != nums[j]) {

				swapp(nums, i, j);
			} else {
				i++;
			}
		}

		List<Integer> ans = new ArrayList<>();
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] - 1 != j) {
				ans.add(nums[j]);

			}

		}
		return ans;

	}

	private static void swapp(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}

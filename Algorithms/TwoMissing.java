package KunalKush;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoMissing {
	public static void main(String[] args) {
		int[] a = { 4, 3, 2, 7, 8, 2, 3, 1 };
		List<Integer> aa = missing(a);
		System.out.println(aa);
	}

	static List<Integer> missing(int[] nums) {
		// TODO Auto-generated method stub
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
			if (nums[j] != j + 1) {
				ans.add(j + 1);

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

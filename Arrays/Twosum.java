package array;

import java.lang.*;
import java.util.Arrays;

public class Twosum {

	public static void main(String[] args) {
		int[] num = { 3,2,3 };
		int target = 6;
		int[] ans = twoSum(num, target);
		System.out.println(Arrays.toString(ans));

	}

	public static int[] twoSum(int[] nums, int target) {
		int [] anss = new int[2];
		int n = nums.length;
		for (int i = 0; i < n; i++) {

			for (int j = i + 1; j < n; j++) {
				int ans = 0;
				ans = nums[j] + nums[i];

				if (ans == target) {
					  anss[0]=i;
						anss[1]=j;
					return anss;
				}

			}
			// break;
		}
		return anss;

	}
}

package binary;

import java.util.Arrays;

public class TwoSumB {
	public static void main(String[] args) {
		int a[] = {-1,0};
		int target = -1;
		int[] ans = twoSum(a, target);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] twoSum(int[] n, int target) {

		int start = 0;
		int end = n.length - 1;

		while (start <= end) {
			int sum = n[start] + n[end];

			if (sum == target) {
				return new int[] { start+1, end+1 };
			}

			if (sum >= target) {
				end = end - 1;
			} else {
				start = start + 1;
			}
		}

		return new int[] { 0, 0 };
	}

}

package Leetcode;

public class SingleElementinaSortedArray {
	public static void main(String[] args) {
		int nums[] = {1,1,2,3,3,4,4,8,8};
		int ans = singleNonDuplicate(nums);
		System.out.println(ans);
	}

	private static int singleNonDuplicate(int[] nums) {
		// TODO Auto-generated method stub
		int start = 0;
		int end = nums.length - 1;

		if (nums.length == 1) {
			return nums[0];
		}

		while (start < end) {
			int mid = start + (end - start) / 2;
			if (nums[mid] == nums[mid + 1]) {
				mid = mid - 1;
			}
			if ((mid - start + 1) % 2 != 0) {
				end = mid;
			} else
				start = mid + 1;
		}
		return nums[start];
	}

}

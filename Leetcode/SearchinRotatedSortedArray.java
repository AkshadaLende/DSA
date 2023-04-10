package Leetcode;

public class SearchinRotatedSortedArray {
	public static void main(String[] args) {
          int [] nums={6,7,0,1,2,3,};
          int target=0;
          int ans=search(nums,target);
          System.out.println(ans);
	}

	public static int search(int[] nums, int target) {
		int start = 0;
		int end = nums.length - 1;
		int mid = start + (end - start) / 2;
		int ans1 = found(start, mid, target, nums);
		if (ans1 == -1) {
			int ans2 = found(mid, end, target, nums);
			return ans2;
		} else {
			return ans1;
		}

	}

	public static int found(int start, int end, int target, int[] nums) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == nums[mid]) {
				return mid;
			} else if (target < nums[mid]) {
				end = mid - 1;
			} else if (target > nums[mid]) {
				start = mid + 1;
			}
		}
		return -1;
	}
}

package Leetcode;

import java.util.Arrays;

public class RemoveDuplicatesfromSortedArray {
	public static void main(String[] args) {
		int[] nums = { 1, 1, 2 }; // Input array
		int[] expectedNums = new int[nums.length]; // The expected answer with correct length

		int k = removeDuplicates(nums); // Calls your implementation
		System.out.println(k);
		assert k == expectedNums.length;
		for (int i = 0; i < k; i++) {
			assert nums[i] == expectedNums[i];
		}
//	System.out.println(Arrays.toString(expectedNums));
	}

	private static int removeDuplicates(int[] nums) {

		/*
		 * int count=0; int ans=0; int i=1; for(int j=1;j<nums.length;j++){
		 * if(nums[j-1]!=nums[j]){ count++; i++; }
		 * 
		 * }
		 * 
		 * return count;
		 */

		int insertIndex = 1;
		for (int i = 1; i < nums.length; i++) {
			// We skip to next index if we see a duplicate element
			if (nums[i - 1] != nums[i]) {
				// unique element at insertIndex index and incrementing the insertIndex by 1
				nums[insertIndex] = nums[i];
				insertIndex++;
			}
		}
		return insertIndex;

	}
}

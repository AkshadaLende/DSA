package Leetcode;

public class BuildArrayfromPermutation {
	public static void main(String[] args) {
		int[] nums = { 0, 2, 1, 5, 3, 4 };
		int[] arr1 = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {

			arr1[i] = nums[nums[i]];
			System.out.print(arr1[i] + " ");
		}
	}

}

package Leetcode;

import java.util.Arrays;

public class ConcatenationofArray {
	public static void main(String[] args) {
		int[] nums = {1,3,2,1 };
		int k = 0;
		int arr[] = new int[nums.length * 2];
		for (int i = 0; i < 2; i++) {

			for (int j = 0; j < nums.length; j++) {
				arr[k] = nums[j];
				k++;
			}

			

		}
		System.out.println(Arrays.toString(arr));
	}
}

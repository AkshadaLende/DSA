package Leetcode;

import java.util.Arrays;

public class HowManyNumsmaltheCurrNum {
	public static void main(String[] args) {
		int[] nums = { 8, 1, 2, 2, 3 };
		

		int[] arr = new int[nums.length];
		for (int i = 0; i < arr.length; i++) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {

				if (j != i && nums[j] < nums[i]) {

					count++;
					arr[i] = count;

				}
			}

		}

		System.out.println(Arrays.toString(arr));
	}
}

package Leetcode;

import java.util.Iterator;

public class FindFirstPostivenum {
	public static void main(String[] args) {
		int[] a = { 3,4,1,-1};
		int aa = missing(a);
		System.out.println(aa);
	}

	private static int missing(int[] nums) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i < nums.length) {
			int j = nums[i]-1;
			if ( nums[i]>0 && nums[i]<=nums.length&& nums[i]!= nums[j] ) {
				swap(nums, i, j);
			} else {
				i++;
			}
		}
         for (int j = 0; j < nums.length; j++) {
			if(nums[j]!=j+1) {
				return j+1;
			}
		}
		return nums.length+1;
	}

	private static void swap(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}

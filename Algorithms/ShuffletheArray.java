package KunalKush;

import java.util.Arrays;

public class ShuffletheArray {
	public static void main(String[] args) {
		int[] nums = { 1,2,3,4,4,3,2,1 };
		int n = 4;
		int i = 0;
		int k=1;
		int[] arr = new int[nums.length];
		for (int j = 0; j < arr.length; j++) {
			if (j < n ) {
				arr[i] = nums[j];
				
			
			} else {
				
				arr[k] = nums[j];
				k+=2;
			
			}
			i+=2;
			
		}

		System.out.println(Arrays.toString(arr));
	}

}

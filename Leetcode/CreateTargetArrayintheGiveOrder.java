package Leetcode;

import java.util.Arrays;

public class CreateTargetArrayintheGiveOrder {
	public static void main(String[] args) {
		int[] nums = {0,1,2,3,4};
		int[] index = {0,1,2,2,1};
		int j = 0;
		
		int pass=0;
		int[] target = new int[nums.length];
		for (int i = 0; i < target.length; i++) {

			j = index[i];
			pass=i;
			
			if (j<nums.length && target[j] != 0) {
				
				for (int k = 0; k < i; k++) {
				
					target[pass] = target[pass-1];
				    pass=pass-1;
				}
				
				target[j] = nums[i];
				
			} else {
				
				target[j] = nums[i];
			} 

		}
		System.out.println(Arrays.toString(target));

	}
}

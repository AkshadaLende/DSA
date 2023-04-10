package KunalKush;

import java.util.Arrays;

public class SetMismatch {
	public static void main(String[] args) {
		int a[] = { 1, 2, 2, 3 };
		int[] aa = missing(a);
		System.out.println(Arrays.toString(aa));
	}

	static int [] missing(int[] nums) {
		
		int i = 0;
		while (i < nums.length) {
			int j = nums[i]-1;
			if (nums[i] != nums[j]) {

				swapp(nums, i, j);
			} else {
				i++;
			}
		}

		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != j+1) {
				return new int[] {nums[j] ,j+1};
			}

		}

		return new int[] {-1,-1};

	}

	private static void swapp(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

}

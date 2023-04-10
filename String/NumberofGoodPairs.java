package string;

public class NumberofGoodPairs {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1, 1, 3 };

		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			
			// while( j<nums.length && nums[i] == nums[j]){
			for (int k = i+1; k < nums.length; k++) {
				if( nums[i] == nums[k]) {

					count++;
					
				}
			}

		}
		System.out.println(count);
	}
}

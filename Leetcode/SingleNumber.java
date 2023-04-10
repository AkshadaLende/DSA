package Leetcode;

public class SingleNumber {
	public static void main(String[] args) {
           int nums[]= {1,1,0};
           int ans=singleNumber(nums);
           System.out.println(ans);
	}

	public static int singleNumber(int[] nums) {
		int i = 0;
		int j = 0;
		int ans=0;
		int count=0;
		if (nums.length == 1) {
			return nums[0];
		}
		while (j<nums.length &&i < nums.length    ) {

			if (i!=j &&j < nums.length&& nums[i] == nums[j]) {
				ans=nums[i++];
			//	i++;
				//break;
               count++;
			}else if(j<nums.length) {
				ans=nums[i];
			}
			
          j++;
		}
		
		
		return ans;
	}
}

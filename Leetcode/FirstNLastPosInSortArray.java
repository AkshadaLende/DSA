package Leetcode;

import java.util.Arrays;

public class FirstNLastPosInSortArray {
	public static void main(String[] args) {
		int[] nums = { 5,7,7,8,8,10 };
		int target = 8;
		int[] ans = searchRange(nums, target);
		System.out.println(Arrays.toString(ans));
	}

	/*
	 * private static int[] searchRange(int[] nums, int target) { int i = 0; int
	 * start = i; int end = nums.length-1;
	 * 
	 * if ( nums.length == 0 && target == 0 ) { return new int[] { -1, -1 }; }
	 * 
	 * if(end==nums.length){ return new int[]{-1,-1}; }
	 * 
	 * 
	 * for (int j = 0; j < nums.length; j++) { if(target == nums[j]) { start=j;
	 * break; }else { start=-1; } }
	 * 
	 * for (int j = end; j >=0; j--) { if(target == nums[j]) { end=j; break; }else {
	 * end=-1; } }
	 * 
	 * 
	 * return new int[] { start, end }; }
	 */
	
	 public static int[] searchRange(int[] nums, int target) {
	        int ans[]={-1,-1};
	      int start=binarySearch(nums,target,true);
	      int end=binarySearch(nums,target,false);
	      ans[0]=start;
	      ans[1]=end;
	       
			
			
			

			return new int[] { start, end };
	    }
	    public static int binarySearch(int[]nums , int target,boolean firstIndex){
	        int ans=-1;
			int start = 0;
			int end = nums.length-1;
	        while(start<=end){
	            int mid=start+(end-start)/2;
	            if(target<nums[mid]){
	            end=mid-1;
	            }else if(target>nums[mid]){
	                start=mid+1;
	            }else{
	                ans=mid;
	                if(firstIndex){
	                    end=mid-1;
	                }else{
	                    start=mid+1;
	                }
	            }
	        }
	        return -1;
	    }
}

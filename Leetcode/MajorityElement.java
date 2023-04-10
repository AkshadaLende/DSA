package Leetcode;

public class MajorityElement {
public static void main(String[] args) {
	int [] nums= {3,2,3};
	int ans=majorityElement( nums);
	System.out.println(ans);
}
public static int majorityElement(int[] nums) {
	 int ans=0;
     int ME=nums.length/2;
     // int precount=0;
      for(int i=0;i<nums.length;i++){
          int count=0;
          for(int j=0;j<nums.length;j++){
                  if(nums[i]==nums[j] && nums[i]!=ans){
                        count=count+1;
                  }
          }
          ans=nums[i];
          if(count>ME){
              return nums[i];
          }
      
      }
      return -1;
}
}

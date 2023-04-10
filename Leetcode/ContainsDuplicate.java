package Leetcode;

public class ContainsDuplicate {
  public static void main(String[] args) {
	int nums[]= {1,2,3,4};
	boolean b=containsDuplicate(nums);
	System.out.println(b);
}

private static boolean containsDuplicate(int[] nums) {
	// TODO Auto-generated method stub
	
   
   
     for(int i=0;i<nums.length;i++){
         
         for(int j=i+1;j<nums.length;j++){
                 if(nums[i]==nums[j] ){
                       return true;
                 }
         }
        
     
     }
	
	return false;
}
}

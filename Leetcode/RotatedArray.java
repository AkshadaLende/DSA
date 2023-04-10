package Leetcode;


public class RotatedArray {
public static void main(String[] args) {
	int arr[]= {4,5,6,7,0,1,2};
	
	int ans=rotatedA(arr);
	System.out.println(ans);
}
public static int search(int[] nums, int target) {
	
	int ans1 = rotatedA(nums);
	if (ans1 == -1) {
		return bsearch(nums,target,0,nums.length-1);
	} 
	
	if(nums[ans1]==target) {
	return ans1;
	}
	if(target>=nums[0]) {
		return bsearch(nums,target,0,ans1-1);
		
	}
	return  bsearch(nums,target,ans1+1,nums.length-1);

}
public static int bsearch(int[] nums, int target,int start,int end) {
    
    while(start<=end){
        int mid=start+(end-start)/2;
        if(target==nums[mid]){
          return mid;
        }else if(target<nums[mid]){
         end=mid-1;
        }else if(target>nums[mid]){
         start=mid+1;
        }
    }
    return -1;
}

private static int rotatedA(int[] arr ) {
	// TODO Auto-generated method stub
	
	int start=0;
	int end=arr.length-1;
	while(start<=end) {
		  int mid=start+(end-start)/2;
		  if(mid<end && arr[mid]>arr[mid+1]) {
			  return mid;
		  }
		  if(mid> start && arr[mid]<arr[mid-1]) {
			  return mid-1;
		  }
		  if(arr[mid]<= arr[start]) {
			  end=mid-1;
		  }else {
			  start=mid+1;
		  }
		  
	}
	return -1;
}
}

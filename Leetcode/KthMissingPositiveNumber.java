package Leetcode;

public class KthMissingPositiveNumber {
	public static void main(String[] args) {
      int [] arr= {2};
      int k=1;
      int ans= findKthPositive(arr,k);
      System.out.println(ans);
	}
	public static int findKthPositive(int[] arr, int k) {
        int start=0;
        int end=arr.length;
        int k1=0;
        while(start<end){
        	
            int mid=(start+(end-start)/2);
             k1=arr[mid]-(mid+1);
             if(arr.length==1) {
            	 return end;
             }else
            if(k1<=k){
                start=mid+1;
            }else {
                end=mid;
            }
        }
        return start+k;
    }
}

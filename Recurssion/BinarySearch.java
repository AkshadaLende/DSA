package Recurssion;

public class BinarySearch {
	public static void main(String[] args) {
		int [] a= {1,3,5,66,77,88,99};
	 int target =77;
		int s=0;
		int e=a.length-1;
		System.out.println(serch(a,target,s,e));
		
	}
	public static int serch(int [] a , int target , int s,int e) {
		if(s>e) {
			return -1;
		}
		int m=s+(e-s)/2;
		if(a[m]==target) {
			return m;
		}else if(target<a[m]) {
			return serch(a , target , s, m-1);
		}
		return serch(a , target , m+1, e);
	}

}

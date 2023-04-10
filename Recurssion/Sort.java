package Recurssion;

public class Sort {
	public static void main(String[] args) {
       int[] a= {1,2,3};
       int i=0;
       boolean rev=sort(a,i);
       System.out.println(rev);
	}

	private static boolean sort(int[] a , int i) {
		// TODO Auto-generated method stub
		
		if(i==a.length-1) {
			return true;
		}
		
		return a[i]<a[i+1] && sort( a, i+1);
	}
	
}

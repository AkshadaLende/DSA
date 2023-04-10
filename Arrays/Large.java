//WAP to find largest elements in the array
package array;

public class Large {
	public static void main(String[] args) {
		int [] a= {3,4,6,7,2};
		int large=a[0];
		for(int i=1;i<a.length ;i++) {
			if(a[i]>large) {
				large=a[i];
			}
		}
		System.out.println(large);
	}

}

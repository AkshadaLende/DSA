//WAP to find the smallest elements of the array
package array;

public class Small {
	public static void main(String[] args) {
		int [] a= {3,4,6,7,2};
		int small=a[0];
		for(int i=1;i<a.length ;i++) {
			if(a[i]<small) {
				small=a[i];
			}
		}
		System.out.println(small);
	}

}

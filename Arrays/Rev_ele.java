//WAP to reverse the elements of the array
package array;

import java.util.Arrays;

public class Rev_ele {
	public static void main(String[] args) {
		int a[] = { 2, 3, 4, 5, 6 };
		for (int i = 0; i < a.length / 2; i++) {
			int temp = a[i];
			a[i] = a[a.length - 1 - i];

			a[a.length - 1 - i] = temp;
		}
		
		// to print array
		/*for (int j : a) {
			System.out.print(j);
		}*/
 System.out.println(Arrays.toString(a));
 for (int j : a) {
		System.out.print(j);
	}
     
	}

}

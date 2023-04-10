package array;

import java.util.Arrays;

public class OddEven {
	public static void main(String[] args) {

		int[] a = { 97, 67, 2, 5, 7, 3, 9 };
		int[] c = new int[a.length];
		for (int i = 0; i < a.length; i++) {
			                                  
			if (a[i] % 2 == 0) {
				for (int j = i+1; j < c.length; j++) {
					
				
             
				if (a[j] % 2 != 0) {
					int temp = a[j];
					a[j] = a[i];
					a[i] = temp;
				}	
				}
			}
		}
		System.out.println(Arrays.toString(a));

   	
	}
}

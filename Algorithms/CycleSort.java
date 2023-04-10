package KunalKush;

import java.util.Arrays;

public class CycleSort {
	public static void main(String[] args) {
		int a[] = { 3,1,2 };
		for (int i = 0; i < a.length; i++) {
			if (a[i]-1 ==i) {
				break;
			} else {
				int j = a[i] - 1;
				swapp(a, i,j);
			}
		}
		System.out.println(Arrays.toString(a));
	}

	private static void swapp(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
	}

	

}

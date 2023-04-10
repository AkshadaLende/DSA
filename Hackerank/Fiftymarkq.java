package Hackerank;

import java.util.Arrays;

public class Fiftymarkq {
	public static void main(String[] args) {
		int a[] = { 4, 2,1,3 };
		String ans=ans(a);
		System.out.println(ans);

	}

	private static String ans(int[] a) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i < a.length && (a[i] / 2) <= i) {
			
			if (i == a.length - 1) {
				String s = sort(a);
				//System.out.println(s);
				return"YES";
			}
			i++;
		}
		//System.out.println("no");
		return "NO";
	}

	public static String sort(int[] a) {
		for (int i = 0; i < a.length; i++) {

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					a = swapp(a, i, j);
				}
			}

		}
		System.out.println(Arrays.toString(a));
		return "yes";

	}

	private static int[] swapp(int[] a, int i, int j) {
		// TODO Auto-generated method stub
		int temp = a[j];
		a[j] = a[i];
		a[i] = temp;
		return a;
	}
}

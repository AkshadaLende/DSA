package binary;

import java.util.Arrays;
import java.util.Scanner;

public class Firstnlast {
	public static void main(String[] args) {
		/*
		 * Scanner sc=new Scanner (System.in); System.out.println("a"); int in
		 * =sc.nextInt(); int [] a =new int [in]; for (int i =0 ; i< a.length ; i++) {
		 * a[i]= sc.nextInt(); }
		 */
		int[] a = { 3, 19, 88, 6, 7 };
		int n = a.length;
		for (int i = 0; i < a.length; i++) {

			if (a[0] < a[1]) {

				a[0] = a[ 1];
				a[1]=a[2];
				a[2]=a[3];
				a[3]=a[4];

			}
			if (a[n - 1] < a[0]) {
				a[n - 1] = a[0];

			}

		}

		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}

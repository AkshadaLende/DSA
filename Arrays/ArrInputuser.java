package array;

import java.util.Scanner;

public class ArrInputuser {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		int [] a= new int [n];
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		for (int i : a) {
			System.out.print(i);
		}
	}

}

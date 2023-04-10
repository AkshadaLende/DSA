package string;

import java.util.ArrayList;
import java.util.Scanner;

public class Hackerank_list {
	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT. Your
		 * class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList a = new ArrayList(n);
		for (int i = 0; i < n; i++) {
			a.add(sc.nextInt());
		}
		int b = sc.nextInt();
		for (int i = 0; i < b; i++) {
			String s = sc.next();
			if (s.equals("Insert")) {
				a.add(sc.nextInt(), sc.nextInt());
			}else  {
				a.remove(sc.nextInt());
			}
		}
       for(Object i: a) {
		System.out.print(i + " ");
       }
	}

}

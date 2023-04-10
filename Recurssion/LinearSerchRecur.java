package Recurssion;

import java.util.ArrayList;
import java.util.List;

public class LinearSerchRecur {
	public static void main(String[] args) {
		int a[] = { 5, 1, 3, 4 };
		int target = 6;
		int i = 0;
		boolean ans = find(a, target, i);
		List list = new ArrayList<>();
		list = findAll(a, target, i, list);
		System.out.println(list);
		System.out.println(ans);
	}

	private static boolean find(int[] a, int target, int i) {
		// TODO Auto-generated method stub
		if (i == a.length) {
			return false;
		}
		if (target == a[i]) {
			return true;
		}
		return find(a, target, i + 1);
	}

	private static List findAll(int[] a, int target, int i, List list) {
		// TODO Auto-generated method stub
		if (i == a.length) {

			return list;
		}
		if (target == a[i]) {
			list.add(i);

		}
		return findAll(a, target, i + 1, list);
	}

}

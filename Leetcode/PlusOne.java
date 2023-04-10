package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PlusOne {
	public static void main(String[] args) {
		int[] d = {1,2,3};
		int[] ans = plusOne(d);
		System.out.println(Arrays.toString(ans));
	}

	private static int[] plusOne(int[] digits) {
		int i = digits.length;
		int k = 1;
		
		ArrayList<Integer> digit = new ArrayList<>();
		while (--i >= 0 || k > 0) {
			if (i >= 0)
				k = k + digits[i];
			digit.add(k % 10);

			k = k / 10;

		}
		Collections.reverse(digit);
		int [] obj=  digit.stream().mapToInt(j -> j).toArray();
		return obj;
	}

}

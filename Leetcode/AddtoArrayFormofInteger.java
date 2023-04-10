package Leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AddtoArrayFormofInteger {
	public static void main(String[] args) {
		int num[] = {9};
		int k = 1;
		int N = num.length;
	
		int cur = k;
        List<Integer> sum = new ArrayList();

        int i = N;
        while (--i >= 0 || cur > 0) {
            if (i >= 0)
                cur += num[i];
            sum.add(cur % 10);
            System.out.println(cur%10);
            cur /= 10;
        }

        Collections.reverse(sum);
        System.out.println(sum);
	}
}

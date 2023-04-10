package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class FindLargeSumIn2D {
	public static void main(String[] args) {
		int[][] a = { { 3, 4, 5 }, { 1, 5 }, { 5, 3 }, };
		System.out.println(sum(a));
	}

	private static int sum(int[][] accounts) {
		// TODO Auto-generated method stub
		
		int ans=Integer.MIN_VALUE;
		
		for (int i = 0; i < accounts.length; i++) {
			int sum = 0;
			for (int j = 0; j < accounts[i].length; j++) {
				sum = sum + accounts[i][j];
			}
			if(sum>ans) {
				ans=sum;
			}
		}
		
		return ans;
	}
}

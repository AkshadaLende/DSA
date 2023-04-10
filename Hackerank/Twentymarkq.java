package Hackerank;

import java.util.Iterator;

public class Twentymarkq {
	public static void main(String[] args) {
		int[] wl = { 8, 7, 8, 12, 4, 9, 8 };
		int count = 0;
		int precount = 0;
		for (int i = 0; i < wl.length; i++) {
			if (wl[i] > 6) {
				count++;
			} else {
				if (precount < count) {
					precount = count;
					count = 0;
				}
			}
		}
		if (precount < count) {
			precount = count;
			count = 0;
		}
		System.out.println(precount);
	}
}

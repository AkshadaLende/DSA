package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class FlippinganImage {
	public static void main(String[] args) {
		int image[][] = { { 1, 1, 0 }, { 1, 0, 1 }, { 0, 0, 0 } };
         for (int i = 0; i < image.length; i++) {
        	
		 image[i]=    reverse(image[i]);
		// System.out.println(Arrays.toString(a[i]));
		}
         for (int i = 0; i < image.length; i++) {
			for (int j = 0; j < image.length; j++) {
				if(image[i][j]==0) {
					image[i][j]=1;
				}else {
					image[i][j]=0;
				}
			}
			 System.out.println(Arrays.toString(image[i]));

		}
         
	}

	private static int[] reverse(int[] is) {
		// TODO Auto-generated method stub
		int s=0;
		int e=is.length-1;
		while(s<e) {
			
		is=	swap(is,s,e);
		s++;
		e--;
		}
		return is;
	}

	private static int[] swap(int[] is, int s, int e) {
		// TODO Auto-generated method stub
		int temp = is[e];
		is[e] = is[s];
		is[s] = temp;
		return is;
	}
	
	
}

package Leetcode;

import java.util.Arrays;

public class FindtheHighestAltitude {
	public static void main(String[] args) {
		int[] gain = {-4,-3,-2,-1,4,3,2 };
		int[] g = new int[gain.length + 1];
        int altitude=0;
        int highAlti=0;
        g[0]=0;
        for (int i = 0; i < g.length-1; i++) {
			altitude=altitude+gain[i];
			g[i+1]=altitude;
			if(g[i+1]>=0 && g[i+1]>highAlti) {
				highAlti=g[i+1];
				
			}
		}
        System.out.println(highAlti);
        System.out.println(Arrays.toString(g));
      
	}
}

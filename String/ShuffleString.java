package string;

import java.util.Arrays;

public class ShuffleString {
	public static void main(String[] args) {
		String s = "codeleet";
		int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
		char[] c = s.toCharArray();
		char[] e=new char[c.length];
		
		String str = new String();  
		int index = 0;
		for (int i = 0; i < c.length; i++) {
			index = indices[i];
			e[index] = c[i];
			

		}
		String string = str.valueOf(e); 
		System.out.println(string);
		
	}
}

//check whether strings are anagram or not
package string;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String s = "eat";
		String s1 = "ate";

		if (s.length() == s1.length()) {
			char[] c1 = s.toCharArray();
			char[] c2 = s1.toCharArray();
			sort(c1);
			sort(c2);
			Arrays.sort(c2);
			for (int i = 0; i < c2.length; i++) {
				if (c1[i] != c2[i]) {
					System.out.println("the strings are not an anagram");
				}
			}
			System.out.println("the strings are an anagram");

		} else {
			System.out.println("the strings are not an anagram");
		}
	}

	public static void sort(char[] c) {
		for (int i = 0; i < c.length; i++) {
			for (int j = i + 1; j < c.length; j++) {
				if (c[i] > c[j]) {
					char temp = c[i];
					c[i] = c[j];
					c[j] = temp;
				}
			}
		}
	}

}

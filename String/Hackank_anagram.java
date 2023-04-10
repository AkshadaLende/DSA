package string;

import java.util.Arrays;
import java.util.Scanner;

public class Hackank_anagram {

	public static boolean isAnagram(String a, String b) {
		// Complete the function
		if (a.length() == b.length()) {

			String sc = "";
			String rev = "";
			char[] c1 = a.toCharArray();
			char[] c2 = b.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			for (int i = 0; i < c2.length; i++) {
				sc = sc + c1[i];
				rev = rev + c2[i];

			}
			System.out.println(rev);
			System.out.println(sc);

			if (sc.equalsIgnoreCase(rev)) {
				return true;
			} else {
				return false;
			}
		}

		return false;
	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println('d');
		String a = scan.next();
		String b = scan.next();
		a = a.toLowerCase();
		b = b.toLowerCase();
		a = a.trim();
		b = b.trim();
		scan.close();
		boolean ret = isAnagram(a, b);
		System.out.println((ret) ? "Anagrams" : "Not Anagrams");
	}
}

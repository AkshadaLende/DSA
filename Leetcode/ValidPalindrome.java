package Leetcode;

public class ValidPalindrome {
	
	public static void main(String[] args) {
		String s="A man, a plan, a canal: Panama";
		boolean ans=isPalindrome(s);
		System.out.println(ans);
	}
	
	
	public static boolean isPalindrome(String s) {
		
		
		s.toLowerCase();
		char[] c = s.toCharArray();
		s = s.trim();
		String sc = "";
		String rev = "";

		for (int j = c.length - 1; j >= 0; j--) {

			if (c[j] != ' ' && c[j] != ':' && c[j] != ',') {
				sc = sc + c[j];

			}
		}
		System.out.println(sc);
		char b[] = sc.toCharArray();
		for (int i = b.length - 1; i >= 0; i--) {
			if (b[i] != ' ' || b[i] != ':' && b[i] != ',') {
				rev = rev + b[i];

			}

		}
System.out.println(rev);
		if (sc.equalsIgnoreCase(rev)) {
			// System.out.println(" true ");
			return true;
		}
		// System.out.println("false");
		return false;
	}
}

package string;

public class LongPalindSubstring {
	/*
	 * public static void main(String[] args) { String s = "babad"; String sc = "";
	 * int j = s.length(); int k = 0; System.out.println(j); for (int i = 0; i <
	 * s.length(); i++) {
	 * 
	 * sc = s.substring(i, j); // System.out.println(sc); boolean str =
	 * isPalindrome(sc, i, j); if (str == true) { System.out.println(sc); } else {
	 * j--; } }
	 * 
	 * }
	 * 
	 * private static boolean isPalindrome(String sc, int i, int j) {
	 * 
	 * 
	 * while (i < j) {
	 * 
	 * if (sc.charAt(i) != sc.charAt(j)) return false;
	 * 
	 * i++; j--; }
	 * 
	 * // Given string is a palindrome // return true;
	 * 
	 * String rev = ""; for (int i1 = j-1; i1 > 0; i1--) { rev = rev +
	 * sc.charAt(i1); }
	 * 
	 * if (rev != sc) { return false; }
	 * 
	 * return true; }
	 */
	
	
	
	
	 public String longestPalindrome(String s) {
	        if (s == null || s.length() < 1) return "";
	        int start = 0, end = 0;
	        for (int i = 0; i < s.length(); i++) {
	            int len1 = expandAroundCenter(s, i, i);
	            int len2 = expandAroundCenter(s, i, i + 1);
	            int len = Math.max(len1, len2);
	            if (len > end - start) {
	                start = i - (len - 1) / 2;
	                end = i + len / 2;
	            }
	        }
	        return s.substring(start, end + 1);
	    }

	    private int expandAroundCenter(String s, int left, int right) {
	        int L = left, R = right;
	        while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
	            L--;
	            R++;
	        }
	        return R - L - 1;
	    }
	}


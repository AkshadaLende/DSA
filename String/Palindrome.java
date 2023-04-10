//WAP to check if the string is palindrome or not
package string;

public class Palindrome {
	public static void main(String[] args) {
		String s = "Evil is a deed as i live";
		char[] c = s.toCharArray();
		s = s.trim();
		String sc = "";
		String rev = "";

		for (int j = c.length - 1; j >= 0; j--) {

			if (c[j] != ' ') {
				sc = sc + c[j];

			}
		}
		char b[] = sc.toCharArray();
		for (int i = b.length - 1; i >= 0; i--) {

			rev = rev + b[i];

		}

		if (sc.equalsIgnoreCase(rev)) {
			System.out.println(" true ");
		} else {
			System.out.println("false");
		}

	}
}

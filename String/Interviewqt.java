package string;

public class Interviewqt {
	public static void main(String[] args) {
		String s = "Meet me at the clock tower";
		String[] sc = s.split(" ");
		for (int i = 0; i < sc.length; i++) {
			if (i % 3 == 0) {
				System.out.print(vowel(sc[i] ) +" ");
			} else if (i % 3 == 1) {
				System.out.print(consonant(sc[i])+" ");

			} else if (i % 3 == 2) {
				System.out.print(upperCase(sc[i])+" ");
			}
		}

	}

	public static String upperCase(String s) {
		char[] c = s.toCharArray();

		for (int i = 0; i < c.length; i++) {
			if (c[i] >= 'a' && c[i] <= 'z') {
				c[i] = (char) (c[i] - 32);
			}
		}
		return new String(c);
	}

	public static String consonant(String s) {
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] != 'a' && c[i] != 'e' && c[i] != 'i' && c[i] != 'o' && c[i] != 'u') {
				c[i] ='#';
			}
		}
		return new String(c);
	}

	public static String vowel(String s) {
		char c[] = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i] == 'a' || c[i] == 'e' || c[i] == 'i' || c[i] == 'o' || c[i] == 'u') {
				c[i] = '%';
			}
		}
		return new String(c);
	}

}

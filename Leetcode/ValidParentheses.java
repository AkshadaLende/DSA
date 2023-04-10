package Leetcode;

public class ValidParentheses {
	public static void main(String[] args) {
		String s = "}(";
		boolean ans = isValid(s);
		System.out.println(ans);
	}

	public static boolean isValid(String s) {
		char ch[] = s.toCharArray();
		System.out.println(ch.length);
		if (ch.length < 2) {
			return false;
		}

		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '(' && ch[i + 1] != ')' && ch[i + 1] != '{' && ch[i + 1] != '[') {

				return false;

			} else if (ch[i] == '[' && ch[i + 1] != ']' && ch[i + 1] != '(' && ch[i + 1] != '{') {
				return false;
			}

			else if (ch[i] == '{' && ch[i + 1] != '}' && ch[i + 1] != '(' && ch[i] == '[') {
				return false;
			}
		}
		return true;
	}
}

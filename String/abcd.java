package string;

import java.util.Arrays;

public class abcd {
	public static void main(String[] args) {
		String s = "welcometojava";
		
		String res = new String(" ");
		
		int n = 3;
		for (int i = 0; i <= s.length(); i++) {
			String rev = "";
			for (int j = n; j <= s.length(); j++) {

				rev = rev + s.substring(i, j);
				System.out.print(rev + " ");

				break;
			}

			n = n + 1;
			res = res + rev + " ";

		}
		
		String[] ed = res.split(" ");
		Arrays.sort(ed);
		for (String string : ed) {

			// System.out.print(string + " ");

		}
		System.out.println();
		System.out.println(ed[1] + " " + ed[ed.length - 1]);

	}

}

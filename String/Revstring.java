//WAP to reverse the string
package string;

public class Revstring {
	public static void main(String[] args) {
		String s = "Qspiders";
		String rev = "";
		for (int i = s.length(); i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
	}
}

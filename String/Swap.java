package string;

public class Swap {
	public static void main(String[] args) {
		String a = "cat";
		String b = "bat";
		System.out.println("Before Swapping");
		System.out.println(a);
		System.out.println(b);
		a = a.concat(b);// a+b catbat
		b = a.substring(0, a.length() - b.length()); // cat
		a = a.substring(b.length());// bat
		System.out.println("after Swapping");
		System.out.println(a);
		System.out.println(b);
	}
}

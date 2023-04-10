//WAP to reverse the position of the string
package string;

public class Reversepostion {
	public static void main(String[] args) {
		String s="Welcome to Qspiders";
		s=s.trim();
		String a[]=s.split(" ");// it is used to split words in string
		for (int i = a.length-1; i >= 0; i--) {
			System.out.print(a[i].length()+" ");
		}
	}

}

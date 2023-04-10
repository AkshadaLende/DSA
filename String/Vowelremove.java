//WAp to remove all the vowel from your name
package string;

public class Vowelremove {
	public static void main(String[] args) {
		String s="akshada";
		String res="";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!= 'a' && s.charAt(i)!= 'e' && s.charAt(i)!= 'i'&& s.charAt(i)!= 'o'&& s.charAt(i)!= 'u') {
				res=res+s.charAt(i);
				
			}
		}
		System.out.println(res);
	}

}
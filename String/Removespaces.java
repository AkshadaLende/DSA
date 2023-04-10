  
package string;

public class Removespaces {
	public static void main(String[] args) {
		String s="Welcome to Qspiders";
		String res="";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=' ') {
				res=res+s.charAt(i);
				
			}
		}
		System.out.println(res);
	}

}

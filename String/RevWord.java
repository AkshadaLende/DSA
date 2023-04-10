package string;

public class RevWord {
	public static void main(String[] args) {
		String s = "Akshada lende";
		String rev = "";
		String st = "";
		String[] a = s.split(" ");
		for (int i = 0; i < a.length; i++) {
			String d = a[i];
			char[] ch = d.toCharArray();
			for (int j = d.length() - 1; j >= 0; j--) {
				rev = rev + ch[j];
				
			}
			
			st = st + rev +"  ";
		
		}
		
		System.out.println(st);
	}

}

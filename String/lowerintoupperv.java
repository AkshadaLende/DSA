
package string;

public class lowerintoupperv {
	public static void main(String[] args) {
		String s="JaVa";
		char []c=s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if(c[i]>='A' && c[i]<='Z') {
				c[i] = (char) (c[i]+ 32);
				
			}else {
				c[i] = (char) (c[i]- 32);
				
			}
		}
		
		for(char ch : c) {
			System.out.print(ch);
		}
		
		
		
	}

}

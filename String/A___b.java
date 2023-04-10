package string;

public class A___b {
	public static void main(String[] args) {
		String s="acddbcda cdb acccd cdad cb";
		char c[]=s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			if (c[i]=='a') {
			//	s.substring(i, i+5);
				
				if(c[i+4]=='b') {
					System.out.println("true");
					
				}else {
					System.out.println("false");
				}
				
			}
		}
	}

}

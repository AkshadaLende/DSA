package string;

public class Duplicatesremove {
	public static void main(String[] args) {
		String s="maharashtra";
		char[] c= s.toCharArray();// it is used to convert string into character array
		boolean [] b= new boolean [c.length];
		for (int i = 0; i < b.length; i++) {
			if(b[i]==false) {
				int count=1;
				for (int j = i+1; j < b.length; j++) {
					if(c[i]==c[j]) {
						count++;
						b[j]=true;
						
					}
					
				}
				if(count==1) {
					System.out.print(c[i]+" ");
				}
				
			}

		}
	}

}

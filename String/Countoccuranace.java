package string;

public class Countoccuranace {
	public static void main(String[] args) {
		//String s="maharashtra";
		int [] s= {5,6,7,5,6,7,6,7};
		//char[] c= s.toCharArray();// it is used to convert string into character array
		boolean [] b= new boolean [s.length];
		for (int i = 0; i < b.length; i++) {
			if(b[i]==false) {
				int count=1;
				for (int j = i+1; j < b.length; j++) {
					if(s[i]==s[j]) {
						count++;
						b[j]=true;
					}
				}
				System.out.println(s[i]+" "+count);
			}
		}
	}

}

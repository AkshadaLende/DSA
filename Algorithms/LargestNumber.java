package KunalKush;

import java.util.Arrays;

public class LargestNumber {
	public static void main(String[] args) {
		int[] a= {3,34,39,5,9};
		String aa= largestnumber(a);
		System.out.println(aa);
	}

	private static String largestnumber(int[] a) {
		// TODO Auto-generated method stub
		StringBuffer sa= new StringBuffer();
		String s=Arrays.toString(a);
		String ar=(String) s.substring(1,s.length()-1);
		for (int i = ar.length()-1; i>0; i--) {
			ar=ar+ar.charAt(i);
		}
		return ar;
	}

}

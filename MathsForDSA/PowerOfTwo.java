package MathsForDSA;

import java.util.HashMap;

public class PowerOfTwo {
	public static void main(String[] args) {
		int n=32;
		boolean ans =(n &(n-1))==0;
		HashMap<Integer,String> map= new HashMap<>();
		System.out.println(ans);
	}

}

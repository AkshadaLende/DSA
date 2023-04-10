package MathsForDSA;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfArray {
	public static void main(String[] args) {
		int [] a= {1,2,3,4};
		int[] num= add(a);
		System.out.println(Arrays.toString(num));
	}

	private static int [] add(int[] nums) {
		// TODO Auto-generated method stub
		//List<Integer> n= new ArrayList<>();
		int sum=0;
		int a[]=new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			sum=sum+nums[i];
			a[i]=sum;
			
		}
		
		return a;
	}

}

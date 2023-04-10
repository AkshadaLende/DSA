package Leetcode;

public class FindNumOfDigitEven {
	public static void main(String[] args) {
		int[] a = { 12, 143, 1785, 95 ,66,77,33,22};
		System.out.println(findnumber(a));
	}

	private static int findnumber(int[] nums) {
		// TODO Auto-generated method stub
		int count = 0;
		for (int j = 0; j < nums.length; j++) {

			if (numDigit(nums[j]) % 2 == 0) {
				count++;
			}
		}
		return count;
	}

	private static int numDigit(int a) {
		// TODO Auto-generated method stub
		int count = 0;
		while (a > 0) {
		//int num = a % 10;
			
			a = a / 10;
			count++;
		}
		
		return count;
	}
}

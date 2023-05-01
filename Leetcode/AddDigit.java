package Leetcode;

public class AddDigit {
	public static void main(String[] args) {
		int n = 38;
		int ans = addDigits(n);
		System.out.println(ans);
	}

	public static int addDigits(int num) {
		int sum = 0;

		if (num < 10) {
			return num;
		}
		while (num > 0) {
			int d = num % 10;
			sum = sum + d;
			num = num / 10;
		}

		return addDigits(sum);
	}
}

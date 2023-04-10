package MathsForDSA;

public class SubtractProAndSum {
	public static void main(String[] args) {

		int n = 234;
		int sum = 0;
		int pro = 1;
		while (n > 0) {
		int	t = n % 10;
			pro = pro * t;
			sum = sum + t;
			n = n / 10;

		}
		int Result = pro - sum;
		System.out.println(Result);
	}
}

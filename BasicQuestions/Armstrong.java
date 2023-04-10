package logical;

public class Armstrong {
	public static void main(String[] args) {
		int num = 153;
		int temp = num;
		int sum = 0;
		int count12 = countt(num);
		while (num > 0) {
			int d = num % 10;
			sum = sum + power(d, count12);
			num = num / 10;
		}
		if (sum == temp) {
			System.out.println("Armstrong num");
		} else {
			System.out.println("not an armstrong num");
		}

	}

	public static int countt(int n) {
		int count = 0;
		while (n > 0) {
			n = n / 10;
			count++;
		}

		return count;
	}

	public static int power(int n, int p) {
		int res = 1;
		for (int i = 1; i <= p; i++) {
			res = res * n;
		}
		return res;
	}
}

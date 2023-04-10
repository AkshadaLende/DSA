package logical;

/*public class Binarytodecimal {
	
	static int num = 1111;

	public static void main(String[] args) {

		String bin = "";
		int sum = 0;
		int count12 = countt(num);
		int f = 0;
		while (num > 0 && f<count12) {
			int d = num % 10;
			int e = d * power(2, f);
			sum = sum + e;
			num = num / 10;
			f++;
		}
		System.out.println(sum);
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
		for (int i = p; i > 0; i--) {
			res = res * n;

		}
		return res;

	}

}*/
public class Binarytodecimal {

	static int num = 1010;

	public static void main(String[] args) {

		String bin = "";
		int sum = 0;

		int f = 0;
		while (num > 0) {
			int d = num % 10;
			sum = sum + d * power(2, f);
			num = num / 10;
			f++;
		}
		System.out.println(sum);
	}

	public static int power(int n, int p) {

		int res = 1;
		for (int i = 1; i <=p; i++) {
			res = res * n;

		}
		return res;

	}

}

package string;

public class Hackerank_subarray {
	public static void main(String[] args) {
		int[] a = { 1 ,-2, 4, -5, 1 };
		int count = 0;

		for (int i = 0; i < a.length; i++) {
			int sum = 0;
			for (int j = i; j < a.length; j++) {
				sum = sum + a[j];
				System.out.println(sum);
				if (sum < 0) {
					count++;
				}

			}

		}
		System.out.println(count);
	}

}

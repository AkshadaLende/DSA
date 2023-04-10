package array;

public class findnum {
	public static void main(String[] args) {
		
		int a[] = { 1, 2, 4, 6, 3, 7, 8 };
		int n = a.length + 1;
		int sumall = (n * (n + 1)) / 2;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println(sumall - sum);
	}

}

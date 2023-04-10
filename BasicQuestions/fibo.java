package logical;

/*public class fibo {
	public static void fibo(long n) {
		int a = 0;
		int b = 1;

		System.out.print(a + " " + b);
		while (n - 2 > 0) {
			int c = b;
			b = b + a;
			System.out.print(" " + b);
			a = c;
			n--;
		}

	}

	public static void main(String[] args) {
		fibo(50);
	}

}*/
public class fibo{
	public static void main(String[] args) {
		int a=0;
		int b=1;
		System.out.print(a+ " " + b);
		for(int i=1; i<=48; i++) {
			int c=a+b;
			System.out.print(" "+ c);
			a=b;
			b=c;
			
		}
	}
}

package array;


	public class Main {
		public int a; public long b;

	public void test(long b) {
		System.out.println("long b");

	}

	public void test(int a) { 
		System.out.println("int a");

	}

	public static void main(String[] args) {

	Main e = new Main();
	e.test(9* 1000000000);
}
	}

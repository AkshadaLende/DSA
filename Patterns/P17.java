package patterns;

public class P17 {
	public static void main(String[] args) {
		/*char a='a';
		int n = 5;
		for (char i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i >= j) {
                    // char c= (char)(i+a);
					System.out.print(a++);
				} else {
					System.out.print("  ");
				}

			}
			System.out.println();
		}*/
		
		
		char a='e';
		int n = 5;
		for (char i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (i <= j) {
                     //char c= (char)(i+a);
					System.out.print(a);
				} else {
					System.out.print(" ");
				}

			}
			System.out.println();
			a--;
		}
		
		
	}

}

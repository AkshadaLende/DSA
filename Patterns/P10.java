package patterns;

public class P10 {
	public static void main(String[] args) {
		int n=5;
		/*for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		//Structure of pattern
		/*for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if(i==1 || i==5 || j==1 || j==5) {
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}*/
		
		for (int i = 1; i <=n; i++) {
			for (int j = 1; j <=n; j++) {
				if(i==3  || j==3 ) {
				System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			  System.out.println();
		}
		
	}

}

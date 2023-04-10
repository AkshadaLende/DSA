package patterns;

public class P19 {

	public static void main(String[] args) {
		
		int n=5;
		int as=1;
		for (int i = 1; i <=n; i++) {
			
			for (int j = 1; j <=n; j++) {
				if( i+j>=n+1 ) {
				System.out.print(as+" ");
				}else {
					System.out.print("  ");
				}
				as++;
			}
			
			  System.out.println();
		}
		
}

}

package array;

public class Sumtwod {
	public static void main(String[] args) {
		int[][]a= {
				{1,2,3},
				{4,5,6},
				{7,8,9}};
				
		int[][]b= {
				{1,1,0},
				{2,3,1},
				{2,0,0}};
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.print(a[i][j]+ b[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}

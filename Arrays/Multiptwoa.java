package array;

public class Multiptwoa {
	public static void main(String[] args) {

		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int[][] b = { { 1, 3, 1 }, { 1, 2, 0 }, { 1, 1, 0 } };

		int[][] c = new int[3][3];
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {

				c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j];

				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}

//		int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//
//		int[][] b = { { 1, 3, 1 }, { 1, 2, 0 }, { 1, 1, 0 } };
//		for (int i = 0; i < b.length; i++) {
//			for (int j = 0; j < b.length; j++) {
//				int sum = 0;
//				for (int k = 0; k < b.length; k++) {
//					sum = sum + (a[i][k] * b[k][j]);
//				}
//				System.out.print(sum + " ");
//			}
//			System.out.println();
//		}
	}

}

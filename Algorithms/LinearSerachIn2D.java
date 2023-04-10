package KunalKush;

public class LinearSerachIn2D {
	public static void main(String[] args) {
		int [][] a= {
				{12,14,9},
				{2,5,7},
				{55,47,33},
		};
		int target=33;
		System.out.println(search(a,target));
	}

	private static int search(int[][] a, int target) {
		// TODO Auto-generated method stub
		if(a.length==0) {
			return -1;
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(a[i][j]==target) {
					return target;
				}
			}
		}
		return -1;
	}

}

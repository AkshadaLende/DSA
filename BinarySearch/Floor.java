package binary;

public class Floor {
	public static void main(String[] args) {

	int[] a = { 2, 3, 5, 9, 14, 16, 18 };
	int target=14;
	int ans=floor(a,target);
	System.out.println(ans);

}
//return the index of greater no <=target
public static int floor(int[] a, int t) {
	int s = 0;

	int e = a.length - 1;

	while (s <= e) {
		int m = s+(e-s)/ 2;
		if (t == a[m]) {
			return m;
		} else if (t < a[m]) {
			
			e = m - 1;
		} else if (t > a[m]) {
			
			s = m + 1;
		}
		

	}
	return e;
}

}

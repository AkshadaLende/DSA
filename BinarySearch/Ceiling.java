package binary;

public class Ceiling {
	public static void main(String[] args) {

		// ceiling of number=smallest element in array greater or = target
		// arr=[2,3,5,9,14,16,18], target=14
		// ceiling (arr,target=14)=14
		// ceiling (arr,target=15)=16
		// ceiling (arr,target=4)=5

		int[] a = { 2, 3, 5, 9, 14, 16, 18 };
		int target=1;
		int ans=ceiling(a,target);
		System.out.println(ans);

	}
//return the index of smallest no>=target
	public static int ceiling(int[] a, int t) {
		// but what if target is greater than the greatest number in the array
		
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
			m = s + e / 2;

		}
		return s;
	}
}

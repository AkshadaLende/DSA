package Recurssion;

public class CirBinarySerRecur {
	public static void main(String[] args) {
		int a[] = { 6, 7, 8, 9, 3, 4, 5 };
		int target = 2;
		int s = 0;
		int e = a.length;
		int ans = find(target, a, s, e);
		System.out.println(ans);

	}

	static int find(int target, int a[], int s, int e) {
		int mid = s + (e - s) / 2;
		if(s>e) {
			return -1;
		}
		if (target == a[mid]) {
			return mid;
		}
		if (a[s] <= a[mid]) {
			if (a[s] > target && target < a[mid]) {
				return find(target, a, s, e = mid - 1);
			} else {
				return find(target, a, s = mid + 1, e);
			}
		}
		if (target >= a[mid] && target < a[e]) {
			return find(target, a, s = mid + 1, e);
		}
		return find(target, a, s, e = mid - 1);
	}
}

package array;

public class Selectionsort {
	public static void main(String[] args) {
		int[] a = { 3, 1, 2, 5, 6 };
		for (int i = 0; i < a.length; i++) {
			
			int min = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[min]) {
					min = j;

				}
			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

}

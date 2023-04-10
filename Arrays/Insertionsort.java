package array;

public class Insertionsort {
	public static void main(String[] args) {
		int [] a= {3,5,1,4,2};
		for (int i = 1; i < a.length; i++) {
			int temp=a[i];
			int j=i;
			while(j>0 && a[j-1]>temp ) {
				a[j]=a[j-1];
				j=j-1;
			}
			a[j]=temp;
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}

}

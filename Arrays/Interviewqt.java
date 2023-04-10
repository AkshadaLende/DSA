package array;

public class Interviewqt {
	public static void main(String[] args) {
		int[] a= {1,2,3,5,4,6,7,8,9};
		int [] b= new int[8];
		
		for (int i = 0; i < a.length; i++) {
			b[i]=a[i];
			int temp= b[i];
		
			System.out.println(a[i]);
		}
		
	}

}

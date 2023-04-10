package array;

public class Linersearchjd {
	public static void main(String[] args) {
		int [] arr= {3,4,1,5,2};
		int search=4;
		for (int i = 0; i < arr.length; i++) {
			if(search==arr[i]) {
				System.out.println("the element is present at index:"+ i);
				break;
			}
		}
	}

}

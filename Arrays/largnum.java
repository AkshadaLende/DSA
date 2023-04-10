//WAP to find 2nd largest without any sorting technique
package array;

public class largnum {
	public static void main(String[] args) {
		int [] arr= {2,4,5,6};
	    int large = Integer.MIN_VALUE;//2,4 5 6
	    int slarge= Integer.MIN_VALUE;//2 4 5
	    for (int i = 0; i < arr.length; i++) {
			if(arr[i]>large) {
				slarge=large;
				large=arr[i];
				}
			else if(arr[i]>slarge && arr[i]!=large) {
					slarge=arr[i];
				}
			}
	    System.out.println(large);
	    System.out.println(slarge);
		}
		
				
	}

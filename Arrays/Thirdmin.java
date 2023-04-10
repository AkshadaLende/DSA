package array;

public class Thirdmin {
	public static void main(String[] args) {
		int [] arr= {3,2,1};
	    int small = Integer.MIN_VALUE; // 6 7
	    int ssmall= Integer.MIN_VALUE; //7 6
	    int tsmall=Integer.MIN_VALUE;// 6
	    for (int i = 0; i < arr.length; i++) {
	    	
			if(arr[i]>small ) {
				
				
				tsmall=ssmall;
				ssmall=small;
				small=arr[i];
				}
			
			else if(arr[i]>ssmall && arr[i]!=ssmall) {
				ssmall=arr[i];
			}
			}
	    System.out.println(small);
	   System.out.println(ssmall);
	    System.out.println(tsmall);
		}
		

}

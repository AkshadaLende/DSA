package array;

public class B2 {
	public static void main(String[] args) {
		int [] arr= {34,55,67,98,102};
		int search=98;
		int li=0;//0
		int hi=arr.length-1;//4
		int mi=(li+hi)/2;//2
		while(li<=hi) {
			if(search==arr[mi]) {
			System.out.println(mi);
			break;
			}else if(search>arr[mi]) {
				
				li=mi+1;
			}else if(search<arr[mi]) {
				
				hi=mi-1;
			}
			
			mi=(li+hi)/2;
			
		}
		if(li>hi) {
			
			System.out.println("the element is not present");
		}
	}

}

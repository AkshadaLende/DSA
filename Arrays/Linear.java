//find whether 14 exists in array or not if found return index
package array;

/*public class Linear {
	public static void main(String[] args) {
		int [] arr= {18,12,9,14,77,50};
		int target=14;
		int ans=linearSearch(arr,target);
		System.out.println(ans);
		
	}
	static int linearSearch(int []arr , int target) {
		if(arr.length==0) {
			return -1;
		}
	
	
	for(int index=0 ;index<arr.length ;index++) {
		if(arr[index]==target) {
			return index;
		}
	}
	return -1;// beacuse -1 cannot be a indext
	}
}*/
//find whether 14 exists in array or not if found return target
/*public class Linear {
	public static void main(String[] args) {
		int [] arr= {18,12,9,14,77,50};
		int target=14;
		int ans=linearSearch(arr,target);
		System.out.println(ans);
		
	}
	static int linearSearch(int []arr , int target) {
		if(arr.length==0) {
			return -1;
		}
	
	
	for(int element : arr) {
		if(element==target) {
			return element;
		}
	}
	return -1;
	}
}*/
//find whether 14 exists in array or not if found return true or false
/*public class Linear {
	public static void main(String[] args) {
		int [] arr= {18,12,9,14,77,50};
		int target=14;
		boolean ans=linearSearch(arr,target);
		System.out.println(ans);
		
	}
	static boolean linearSearch(int []arr , int target) {
		if(arr.length==0) {
			return false;
		}
	
	
	for(int element : arr) {
		if(element==target) {
			return true;
		}
	}
	return false;
	}
}*/
//find 3 in range of index 1 to 4
/*public class Linear {
	public static void main(String[] args) {
		int [] arr= {18, 12,-7,3,14,28};
		int target=14;
		int ans=linearSearch(arr,target,1,4);
		System.out.println(ans);
		
	}
	static int linearSearch(int []arr , int target, int start,int end) {
		if(arr.length==0) {
			return -1;
		}
	
	
	for(int index=start ; index<=end ;index++) {
		int element =arr[index];
		if(element==target) {
			return index;
		}
	}
	return -1;
	}
}*/
//find min number
public class Linear {
	public static void main(String[] args) {
		int[] arr = { 18, 12, -7, 3, 14, 28 };
		System.out.println(min(arr));

	}
	public static int min(int[] arr) {
		int ans=arr[0];
		for(int i=1;i<arr.length ;i++) {
			
			if(arr[i]<ans) {
				ans=arr[i];
				
			}
			
		}
		return ans;
		
	}
}

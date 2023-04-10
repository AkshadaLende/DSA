package Recurssion;

import java.util.ArrayList;

public class RecurWithArrays {
	public static void main(String[] args) {
		int[] arr = { 1, 3, 2,4, 4, 5 };
		Boolean n = sort(arr, 0);
		int target=4;
		System.out.println(search(arr,0,target));
	//	System.out.println(n);
		System.out.println(searchIndex(arr, 0, target));
		//searchAllIndex(arr,0,target);
		//System.out.println(list);
		System.out.println(searchAllIndex1(arr,0,target,list));
	}

	private static boolean search(int[] arr, int i, int target) {
		
		if(i==arr.length) {
			return true;
		}
		return arr[i]==target || search(arr,i+1,target) ;
	}
	
	static ArrayList<Integer> list =new ArrayList<>();
private static void searchAllIndex(int[] arr, int i, int target) {
		
		if(i==arr.length) {
			return ;
		}
		
		if(arr[i]==target) {
			list.add(i);
		}
		
		searchAllIndex(arr,i+1,target) ;
		
	}

private static ArrayList<Integer> searchAllIndex2(int[] arr, int i, int target) {
	
	 ArrayList<Integer> list =new ArrayList<>();
	if(i==arr.length) {
		return list ;
	}
	
	if(arr[i]==target) {
		list.add(i);
	}
	
	 ArrayList<Integer> ansfromBelowCalls=	searchAllIndex2(arr,i+1,target) ;
	list.addAll(ansfromBelowCalls);
	return list;
}

private static ArrayList<Integer> searchAllIndex1(int[] arr, int i, int target,ArrayList<Integer> list) {
	
	if(i==arr.length) {
		return list ;
	}
	
	if(arr[i]==target) {
		list.add(i);
	}
	
return	searchAllIndex1(arr,i+1,target,list) ;
	
}


private static int searchIndex(int[] arr, int i, int target) {
		
		if(i==arr.length) {
			return -1;
		}
		
		if(arr[i]==target) {
			return i;
		}
		else {
		return  searchIndex(arr,i+1,target) ;
		
		}
	}
	

	static Boolean sort(int[] arr, int i) {
		// TODO Auto-generated method stub
		if (i == arr.length - 1) {
			return true;
		}

		return arr[i] < arr[i + 1] && sort(arr, i + 1);
	}
}

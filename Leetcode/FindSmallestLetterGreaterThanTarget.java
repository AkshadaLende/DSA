package Leetcode;

public class FindSmallestLetterGreaterThanTarget {
	public static void main(String[] args) {
		char ch[] = { 'c', 'f', 'j','j' };
		char target = 'z';
		char ans = nextGreatestLetter(ch, target);
		System.out.println(ans);
	}

	public static char nextGreatestLetter(char[] letters, char target) {
		int start = 0;
		int end = letters.length ;
		
		while (start < end) {
			int mid = start + (end - start) / 2;
			
			  if (target == letters[mid]) {
			  
			 return letters[mid+1]; } else
			 if (target >= letters[mid]) {
				start = mid + 1;
			} else if (target <= letters[mid]) {

				end = mid ;
			} 

		}
		System.out.println(start%letters.length);
		return letters[start %letters.length];
	}
}

package binary;

public class Returnchar {
	public static void main(String[] args) {
		char[] ch = { 'a', 'b', 'c', 'f', 'g', 'h' };
		char target = 'd';
		char ans=gL(ch, target);
		
		System.out.println(ans);//f
		
	}
// return character of smallest element in the array but greatest of target
	public static char gL(char[] ch, char target) {
		int start = 0;
		int end = ch.length-1;
		
		
		while (start <= end) {
			int middle = start + (end - start) / 2;

			if (target <ch[ middle]) {
				end = middle - 1;

			} else  {
				start = middle + 1;

			}
		}
		return ch[start % ch.length];
	}
}

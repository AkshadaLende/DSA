package Leetcode;

public class SortingtheSentence {
	public static void main(String[] args) {
		String s = "abcdefd";
		char ch = 'd';
		String ans = sortSentence(s, ch);
		System.out.println(ans);

	}

	public static String sortSentence(String word, char ch) {

		/*
		 * char[] ch1 = word.toCharArray(); String rev = ""; int count = 0; int count1 =
		 * 0; for (int i = 0; i < ch1.length; i++) { if (count1 < 1 && ch == ch1[i]) {
		 * count1++; count = i; while (count >= 0) { rev = rev + ch1[count]; count--; }
		 * 
		 * }
		 * 
		 * } System.out.println(word.indexOf(ch)); for (int i = word.indexOf(ch)+1; i <
		 * ch1.length; i++) { rev = rev + ch1[i]; } if (word.indexOf(ch) == -1) { return
		 * word; } return rev;
		 */
		char[] chArray = word.toCharArray();

        //Step-1 : 
        //Check if the given character exists in the given string
        int idx;
        for(idx=0; idx<chArray.length; idx++)
        {
            if(chArray[idx] == ch) break;
        }

        //Step-2:
        //If the given charater does not exist, 
        //return the given string.
        if(idx == chArray.length) return word;

        //Step-3:
        //Use 2 pointer approach to reverse the char array
        //& return as string.
        for(int left=0, right=idx; left<right; left++, right--)
        {
            char temp = chArray[left];
            chArray[left] = chArray[right]; 
            chArray[right] = temp;           
        }
        return new String(chArray);
	}
}

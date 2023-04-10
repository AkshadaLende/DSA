package Leetcode;

public class CheckiftheSentenceIsPangram {
	public static void main(String[] args) {
		String sentence = "thequickbrownfoxjumpsoverthelazydog";
		boolean b = checkIfPangram(sentence);
		System.out.println(b);
	}

	public static boolean checkIfPangram(String sentence) {
	
		for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);

          
            if (sentence.indexOf(ch) == -1)
                return false;
        }
        
  
        return true;
    }
	
}

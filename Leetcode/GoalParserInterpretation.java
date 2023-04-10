package Leetcode;

public class GoalParserInterpretation {
	public static void main(String[] args) {
		String command = "(al)G(al)()()G";
		String ans = interpret(command);
		System.out.println(ans);
	}

	public static String interpret(String command) {
		char [] c=command.toCharArray();
		String s = "";
		String G="G";
		String o="o";
		String al="al"; 
		for (int i = 0; i < command.length(); i++) {
			if ('G' == c[i])   {
				s=s+"G";
			} else if ('(' == c[i] && ')' ==c[i+1]  ) {
				s = s + "o";
			} else if ('(' == c[i] && 'a' ==c[i+1]  ) {
				s = s + "al";
				i=i+3;
			//	break;
			}
		}
		return s;
	}
}         

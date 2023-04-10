package Leetcode;

public class StringAnalyzer {
    public static void main(String[] args) {
        String s = "abs 9 7.8 hasgj";
        int wordCount = 0;
        int intCount = 0;
        int floatCount = 0;

        String[] words = s.split("\\s+");
        for (String word : words) {
            if (word.matches("\\d+")) {
                intCount++;
            } else if (word.matches("\\d+\\.\\d+")) {
                floatCount++;
            } else {
                wordCount++;
            }
        }
    }
}

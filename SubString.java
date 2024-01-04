package PowerRouter;

// 1. Write a Java program to find the longest substring from a given string that 
// doesn’t contain any duplicate characters.
// Example:
// Input : Welcome to PowerRouter.
// Output : Welcome


public class SubString {
    public static void main(String args[]) {
        String input = "Welcome to PowerRouter";

        String array[] = input.split(" ");

        String longestSubstring = "";

        for (int i = 0; i < array.length; i++) {
            String currentWord = array[i];
            String longestSubstringInWord = findLongestSubstring(currentWord);

            if (longestSubstringInWord.length() > longestSubstring.length()) {
                longestSubstring = longestSubstringInWord;
            }
        }

        System.out.println("Longest Substring without duplicate characters: " + longestSubstring);
    }

    public static String findLongestSubstring(String word) {
        int start = 0;
        int end = 0;
        int maxLength = 0;

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            for (int j = start; j < i; j++) {
                if (word.charAt(j) == currentChar) {
                    start = j + 1;
                    break;
                }
            }

            end = i + 1;
            maxLength = Math.max(maxLength, end - start);
        }

        return word.substring(start, start + maxLength);
    }
}
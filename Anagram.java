package PowerRouter;

// 4. Write a program to check if two strings are Anagrams?
// Example:
// ○ Input : Welcome
// ○ Output : ceelmow


public class Anagram
{
    public static void main(String[] args) {
        String str1 = "Welcome";
        String str2 = "ceelmow";

        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    
    public static boolean areAnagrams(String s1, String s2) {
        
        if (s1.length() != s2.length()) {
            return false;
        }

        
        int[] count1 = new int[256];
        int[] count2 = new int[256];

        
        for (int i = 0; i < s1.length(); i++) {
            count1[s1.charAt(i)]++;
            count2[s2.charAt(i)]++;
        }

        
        for (int i = 0; i < 256; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }

        return true;
    }
}

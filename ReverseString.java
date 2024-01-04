package PowerRouter;

// 6. Write a program to reverse a string.
// Example:
// ○ Input : Welcome
// ○ Output : emoclew

public class ReverseString {
    public static void main(String[] args) {
        String in="Welcome";

        for(int i=in.length()-1;i>=0;i--)
        {
            System.out.print(in.charAt(i));
        }
    }
}

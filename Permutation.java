package PowerRouter;

// 3. Write a program to print all permutations of a string.
// Example:
// ○ Input : CAT
// ○ Output : CAT , CTA , ACT , ATC , TAC , TCA

public class Permutation 
{
    public static void main(String[] args) 
    {
        String str = "CAT";
        generatePermutations("", str);
    }

    public static void generatePermutations(String prefix, String remaining) 
    {
        int n = remaining.length();
        if (n == 0) 
        {
            System.out.println(prefix);
        } 
        else    
        {
            for (int i = 0; i < n; i++) 
            {
                generatePermutations(prefix + remaining.charAt(i),
                remaining.substring(0, i) + remaining.substring(i + 1));
            }
        }
    }
}
